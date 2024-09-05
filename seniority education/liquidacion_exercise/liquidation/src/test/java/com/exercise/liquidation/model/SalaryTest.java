package com.exercise.liquidation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SalaryTest {
    @Test
    void shouldSalaryWhenIsValid() {

        //Arrange
        Integer documentIdOp = 23;

        //Act
        Integer documentId = new Salary(documentIdOp).getSalary();

        //Assert
        Assertions.assertNotNull(documentId);
        Assertions.assertEquals(documentId, documentIdOp);

    }

    @Test
    void shouldNotSalaryWhenIsNull() {

        //Arrange
        Integer salaryNull = null;

        //Act
        NullPointerException thrown = Assertions.assertThrows(
                NullPointerException.class,
                () -> new Salary(salaryNull),
                "salary can not be null"
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), NullPointerException.class);
        Assertions.assertTrue(thrown.getMessage().contains("salary can not be null"));

    }
}
