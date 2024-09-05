package com.exercise.liquidation.service;

import com.exercise.liquidation.controller.dto.EmployeeDTO;
import com.exercise.liquidation.model.Employee;
import com.exercise.liquidation.model.EmployeeMapper;
import com.exercise.liquidation.repository.EmployeeRepositoyAdapter;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Data
@Slf4j
public class EmployeeImp implements EmployeeServ {

    private final EmployeeRepositoyAdapter employeeRepositoyAdapter;

    @Override
    public Mono<List<EmployeeDTO>> findAllEmployees() {
        return employeeRepositoyAdapter.findAllEmployees().map(EmployeeMapper::fromEmployeeListDomainToDTO);

    }

    @Override
    public Mono<EmployeeDTO> createEmployee(Mono<Employee> employeeDom) {
        return employeeDom.flatMap(employee ->
                employeeRepositoyAdapter.saveEmployee(employee)
                        .map(EmployeeMapper::fromEmployeeDomainToDTO));
    }


}
