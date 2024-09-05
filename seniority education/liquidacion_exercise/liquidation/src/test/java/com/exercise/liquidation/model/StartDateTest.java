package com.exercise.liquidation.model;

import com.exercise.liquidation.model.exception.CustomException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class StartDateTest {

    @Test
    void shouldGetStartDateWhenIsValid() {

        //Arrange
        LocalDate startDateT = LocalDate.of(2015,2,5);

        //Act
        StartDate branch = new StartDate(startDateT);
        LocalDate startDate = branch.getStartDate();

        //Assert
        Assertions.assertNotNull(startDate);
        Assertions.assertEquals(startDateT,startDate);

    }

    @Test
    void shouldGetStartDateWhenIsNotBetweenDates() {

        //Arrange
        LocalDate startDateT = LocalDate.of(2020,2,5);

        //Act
        CustomException thrown = Assertions.assertThrows(
                CustomException.class,
                () -> new StartDate(startDateT),
                "startDate cannot after 2015-06-06 or before 2015-01-01"
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), CustomException.class);
        Assertions.assertTrue(thrown.getMessage().contains("startDate cannot after 2015-06-06 or before 2015-01-01"));

    }

    @Test
    void shouldNotStartDateWhenIsNull() {

        //Arrange
        LocalDate salaryNull = null;

        //Act
        NullPointerException thrown = Assertions.assertThrows(
                NullPointerException.class,
                () -> new StartDate(salaryNull),
                "startDate can not be null"
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), NullPointerException.class);
        Assertions.assertTrue(thrown.getMessage().contains("startDate can not be null"));

    }
}
