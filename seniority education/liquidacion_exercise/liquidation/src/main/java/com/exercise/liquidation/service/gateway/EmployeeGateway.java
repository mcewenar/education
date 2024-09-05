package com.exercise.liquidation.service.gateway;

import com.exercise.liquidation.model.Employee;
import reactor.core.publisher.Mono;

import java.util.List;

public interface EmployeeGateway {
    Mono<List<Employee>> findAllEmployees();
    Mono<Employee> saveEmployee(Employee employee);
}

