package com.exercise.liquidation.model;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class Name {

    @Size(min=1, max=30)
    @Pattern(regexp="^[a-zA-Z]+$")
    private String name;

    public Name(String name) {
        Objects.requireNonNull(name, "Name can not be null");
        this.name = name;
    }
}
