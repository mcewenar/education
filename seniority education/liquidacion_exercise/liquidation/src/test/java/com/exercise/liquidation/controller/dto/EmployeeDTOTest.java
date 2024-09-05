package com.exercise.liquidation.controller.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class EmployeeDTOTest {

    EmployeeDTO employeeDTO1 = EmployeeDTO.builder()
            .documentId(12)
            .name("test")
            .startDate(LocalDate.of(2015,4,4))
            .position("dev")
            .salary(1500000)
            .build();

    EmployeeDTO employeeDTO2 = EmployeeDTO.builder()
            .documentId(12)
            .name("test")
            .startDate(LocalDate.of(2015,4,4))
            .position("dev")
            .salary(1500000)
            .build();

    @Test
    void shouldCitiesResponseIsValid() {

        Assertions.assertNotNull(employeeDTO1);
        Assertions.assertEquals(employeeDTO1.getName(), employeeDTO2.getName());
        Assertions.assertEquals(employeeDTO1.getPosition(), employeeDTO2.getPosition());

    }
}
