package com.exercise.liquidation.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @Min(7)
    @Max(15)
    @NotNull(message = "Id can not be null")
    @JsonProperty("cedula")
    private Integer documentId;

    @Size(min=1, max=30)
    @Pattern(regexp="^[a-zA-Z]+$")
    @NotNull(message = "Name can not be null")
    @JsonProperty("nombre")
    private String name;

    @NotNull(message = "fecha_inicio can not be null")
    @JsonProperty("fecha_inicio")
    private LocalDate startDate;

    @Size(min=10, max=30)
    @Pattern(regexp="^[a-zA-Z]+$")
    @JsonProperty("cargo")
    private String position;


    @Min(1300000)
    @Max(7000000)
    @NotNull(message = "Salario can not be null")
    @JsonProperty("salario")
    private Integer salary;
}