package com.exercise.liquidation.service;

import com.exercise.liquidation.controller.dto.EmployeeDTO;
import com.exercise.liquidation.model.Employee;
import reactor.core.publisher.Mono;

import java.util.List;

public interface EmployeeServ {
    Mono<List<EmployeeDTO>> findAllEmployee();
    Mono<EmployeeDTO> createEmployee(Mono<Employee> employee);

}
