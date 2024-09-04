package com.exercise.liquidation.repository;

import com.exercise.liquidation.model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeMapperData {

    private static final DateTimeFormatter DB_FORMATTER = DateTimeFormatter.ofPattern("yyyy/dd/MM");

    public static Employee toDomain(EmployeeData employeeData) {
        return Employee.builder()
                .documentId(new DocumentId(employeeData.getDocumentId()))
                .name(new Name(employeeData.getName()))
                .startDate(new StartDate(toLocalDate(employeeData.getStartDate())))
                .position(new Position(employeeData.getPosition()))
                .salary(new Salary(employeeData.getSalary()))
                .build();
    }

    public static EmployeeData toData(Employee employee) {
        return EmployeeData.builder()
                .documentId(employee.getDocumentId().getDocumentId())
                .name(employee.getName().getName())
                .startDate(toDatabaseFormat(employee.getStartDate().getStartDate()))
                .position(employee.getPosition().getPosition())
                .salary(employee.getSalary().getSalary())
                .build();
    }

    public static String toDatabaseFormat(LocalDate startDate) {
        return startDate.format(DB_FORMATTER);
    }


    public static LocalDate toLocalDate(String stringYYYYddMM) {
        return LocalDate.parse(stringYYYYddMM, DB_FORMATTER);
    }
}
