package com.exercise.liquidation.service.gateway;

import com.exercise.liquidation.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeGateway {
    Flux<Employee> findAllEmployees();
    Mono<Employee> saveEmployee(Employee employee);
}

