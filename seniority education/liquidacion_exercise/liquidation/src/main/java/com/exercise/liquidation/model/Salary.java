package com.exercise.liquidation.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class Salary {

    private Integer salary;

    public Salary(Integer salary) {
        Objects.requireNonNull(salary, "salary can not be null");
        this.salary = salary;
    }
}
