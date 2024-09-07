package com.exercise.liquidation.service;

import com.exercise.liquidation.controller.dto.EmployeeDTO;
import com.exercise.liquidation.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeServ {
    Flux<EmployeeDTO> findAllEmployees();
    Mono<EmployeeDTO> createEmployee(Mono<Employee> employee);

}
