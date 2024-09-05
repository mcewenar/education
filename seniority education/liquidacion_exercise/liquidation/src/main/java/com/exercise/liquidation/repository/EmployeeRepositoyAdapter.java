package com.exercise.liquidation.repository;

import com.exercise.liquidation.model.*;

import lombok.Data;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;


@Data
@Repository
public class EmployeeRepositoyAdapter {

    private final EmployeeDataRepository repository;

    public Mono<List<Employee>> findAllEmployees() {
        return repository.findAll().map(EmployeeMapperData::toDomain).collectList();
    }

    public Mono<Employee> saveEmployee(Employee employee) {
        return repository.save(EmployeeMapperData.toData(employee)).map(EmployeeMapperData::toDomain);
    }
}
