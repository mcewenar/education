package com.exercise.liquidation.model;

import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Objects;

@Data
@NoArgsConstructor
public class DocumentId {

    private Integer documentId;

    public DocumentId(Integer documentId) {
        Objects.requireNonNull(documentId, "DocumentId can not be null");
        this.documentId = documentId;
    }


}
