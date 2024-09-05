package com.exercise.liquidation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PositionTest {
    @Test
    void positionTestIsValid() {

        //Arrange
        String name = "test";

        //Act
        String actualIdentifier = new Position(name).getPosition();

        //Assert
        Assertions.assertNotNull(actualIdentifier);
        Assertions.assertEquals(actualIdentifier, name);

    }
}
