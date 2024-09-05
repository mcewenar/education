package com.exercise.liquidation.model.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomExceptionTest {

    @Test
    void testExceptionWithTitle() {
        String description = "Validation Error";

        CustomException exception = new CustomException(description);

        assertEquals(description, exception.getMessage());
        assertNotNull(exception.getMessage());
    }

    @Test
    void testExceptionWithTitle2() {
        String description = "Validation Error2";

        CustomException exception = new CustomException(description);

        assertEquals(description, exception.getMessage());
        assertNotNull(exception.getMessage());
    }

}
