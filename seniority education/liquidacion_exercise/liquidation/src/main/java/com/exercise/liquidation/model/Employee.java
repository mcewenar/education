package com.exercise.liquidation.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Employee {

    private DocumentId documentId;
    private StartDate startDate;
    private Name name;
    private Position position;
    private Salary salary;


}
