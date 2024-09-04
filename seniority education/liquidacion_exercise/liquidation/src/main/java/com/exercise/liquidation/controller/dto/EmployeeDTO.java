package com.exercise.liquidation.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "Id can not be null")
    @JsonProperty("cedula")
    private Integer documentId;

    @NotNull(message = "Name can not be null")
    @JsonProperty("nombre")
    private String name;

    @NotNull(message = "fecha_inicio can not be null")
    @JsonProperty("fecha_inicio")
    private LocalDate startDate;

    @JsonProperty("cargo")
    private String position;

    @NotNull(message = "Salario can not be null")
    @JsonProperty("salario")
    private Integer salary;
}