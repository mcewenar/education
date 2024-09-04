package com.exercise.liquidation.repository;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;


@Getter
@Builder(toBuilder = true)
@Document(collection = "employee")
public class EmployeeData implements Serializable {

    @Id
    private String _id;

    @Field("document_id")
    private Integer documentId;

    @Field("nombre")
    private String name;

    @Field("fecha_inicio")
    private String startDate;

    @Field("cargo")
    private String position;

    @Field("salario")
    private Integer salary;

    public EmployeeData(String _id, Integer documentId, String name, String startDate, String position, Integer salary) {
        this._id = _id;
        this.documentId = documentId;
        this.name = name;
        this.startDate = startDate;
        this.position = position;
        this.salary = salary;
    }


}

