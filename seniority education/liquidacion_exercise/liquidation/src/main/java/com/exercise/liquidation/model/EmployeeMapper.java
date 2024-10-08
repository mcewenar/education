package com.exercise.liquidation.model;

import com.exercise.liquidation.controller.dto.EmployeeDTO;

public class EmployeeMapper {

    public static EmployeeDTO fromEmployeeDomainToDTO(Employee employee){
        return EmployeeDTO.builder().documentId(employee.getDocumentId().getDocumentId())
                                .name(employee.getName().getName())
                                .startDate(employee.getStartDate().getStartDate())
                                .position(employee.getPosition().getPosition())
                                .salary(employee.getSalary().getSalary())
                                .build();
    }

    public static Employee fromEmployeeDTOToDomain(EmployeeDTO employeeDTO){
        return Employee.builder()
                .documentId(new DocumentId(employeeDTO.getDocumentId()))
                .name(new Name(employeeDTO.getName()))
                .startDate(new StartDate(employeeDTO.getStartDate()))
                .position(new Position(employeeDTO.getPosition()))
                .salary(new Salary(employeeDTO.getSalary()))
                .build();
    }
}
