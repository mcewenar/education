package com.exercise.liquidation.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class Salary {
    @Min(1300000)
    @Max(7000000)
    private Integer salary;

    public Salary(Integer salary) {
        Objects.requireNonNull(salary, "salary can not be null");
        this.salary = salary;
    }
}
