package com.exercise.liquidation.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Objects;

@Data
@NoArgsConstructor
public class DocumentId {

    @Min(7)
    @Max(15)
    private Integer documentId;

    public DocumentId(Integer documentId) {
        Objects.requireNonNull(documentId, "DocumentId can not be null");
        this.documentId = documentId;
    }


}
