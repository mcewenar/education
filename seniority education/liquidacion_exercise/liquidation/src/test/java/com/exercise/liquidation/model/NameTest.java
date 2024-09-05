package com.exercise.liquidation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NameTest {

    @Test
    void nameTestIsValid() {

        //Arrange
        String name = "test";

        //Act
        String actualIdentifier = new Name(name).getName();

        //Assert
        Assertions.assertNotNull(actualIdentifier);
        Assertions.assertEquals(actualIdentifier, name);

    }

    @Test
    void shouldNotNameWhenIsNull() {

        //Arrange
        String salaryNull = null;

        //Act
        NullPointerException thrown = Assertions.assertThrows(
                NullPointerException.class,
                () -> new Name(salaryNull),
                "Name can not be null"
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), NullPointerException.class);
        Assertions.assertTrue(thrown.getMessage().contains("Name can not be null"));

    }
}
