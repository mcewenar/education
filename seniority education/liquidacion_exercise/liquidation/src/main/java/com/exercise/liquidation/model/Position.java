package com.exercise.liquidation.model;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Position {

    @Size(min=10, max=30)
    @Pattern(regexp="^[a-zA-Z]+$")
    private String position;

    public Position(String position) {
        this.position = position;
    }
}
