package com.exercise.liquidation.service;

import com.exercise.liquidation.controller.dto.EmployeeDTO;
import com.exercise.liquidation.model.Employee;
import com.exercise.liquidation.model.EmployeeMapper;
import com.exercise.liquidation.service.gateway.EmployeeGateway;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Data
@RequiredArgsConstructor
@Slf4j
public class EmployeeImp implements EmployeeServ  {

    private final EmployeeGateway employeeGateway;

    @Override
    public Flux<EmployeeDTO> findAllEmployees() {
        return employeeGateway.findAllEmployees().map(EmployeeMapper::fromEmployeeDomainToDTO);
    }

    @Override
    public Mono<EmployeeDTO> createEmployee(Mono<Employee> employeeDom) {
        return employeeDom.flatMap(employee ->
                employeeGateway.saveEmployee(employee)
                        .map(EmployeeMapper::fromEmployeeDomainToDTO));
    }


}
