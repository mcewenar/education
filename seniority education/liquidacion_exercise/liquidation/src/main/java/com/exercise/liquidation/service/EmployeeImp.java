package com.exercise.liquidation.service;

import com.exercise.liquidation.controller.dto.EmployeeDTO;
import com.exercise.liquidation.model.Employee;
import com.exercise.liquidation.model.EmployeeMapper;
import com.exercise.liquidation.repository.EmployeeRepositoyAdapter;
import com.exercise.liquidation.service.gateway.EmployeeGateway;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Data
@Slf4j
public class EmployeeImp implements EmployeeServ  {

    private final EmployeeRepositoyAdapter employeeGateway;

    @Override
    public Mono<List<EmployeeDTO>> findAllEmployees() {
        return employeeGateway.findAllEmployees().map(EmployeeMapper::fromEmployeeListDomainToDTO);

    }

    @Override
    public Mono<EmployeeDTO> createEmployee(Mono<Employee> employeeDom) {
        return employeeDom.flatMap(employee ->
                employeeGateway.saveEmployee(employee)
                        .map(EmployeeMapper::fromEmployeeDomainToDTO));
    }


}
