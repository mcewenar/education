package com.exercise.liquidation.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class Name {

    private String name;

    public Name(String name) {
        Objects.requireNonNull(name, "Name can not be null");
        this.name = name;
    }
}
