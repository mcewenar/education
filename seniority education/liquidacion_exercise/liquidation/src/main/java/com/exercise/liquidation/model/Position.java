package com.exercise.liquidation.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Position {

    private String position;

    public Position(String position) {
        this.position = position;
    }
}
