package com.exercise.liquidation.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeDataRepository extends ReactiveMongoRepository<EmployeeData, String> {
}
