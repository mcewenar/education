package com.exercise.liquidation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DocumentIdTest {
    @Test
    void shouldDocumentIdWhenIsValid() {

        //Arrange
        Integer documentIdOp = 23;

        //Act
        Integer documentId = new DocumentId(documentIdOp).getDocumentId();

        //Assert
        Assertions.assertNotNull(documentId);
        Assertions.assertEquals(documentId, documentIdOp);

    }

    @Test
    void shouldNotDocumentIdWhenIsNull() {

        //Arrange
        Integer documentIdOp = null;

        //Act
        NullPointerException thrown = Assertions.assertThrows(
                NullPointerException.class,
                () -> new DocumentId(documentIdOp),
                "DocumentId can not be null"
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), NullPointerException.class);
        Assertions.assertTrue(thrown.getMessage().contains("DocumentId can not be null"));

    }
}
