package com.exercise.liquidation.model;

import com.exercise.liquidation.controller.dto.EmployeeDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeMapperTest {

    final EmployeeDTO employeeDTO = EmployeeDTO.builder()
            .documentId(1)
            .name("test")
            .startDate(LocalDate.of(2015,2,2))
            .position("dev")
            .salary(1500000)
            .build();

    final Employee employee1 = Employee.builder()
            .documentId(new DocumentId(1))
            .name(new Name("test1"))
            .startDate(new StartDate(LocalDate.of(2015,2,2)))
            .position(new Position("testDev"))
            .salary(new Salary(1500000))
            .build();

    final Employee employee2 = Employee.builder()
            .documentId(new DocumentId(2))
            .name(new Name("test2"))
            .startDate(new StartDate(LocalDate.of(2015,2,2)))
            .position(new Position("testDev2"))
            .salary(new Salary(1500000))
            .build();

    List<Employee> employeeList = List.of(employee1,employee2);

    @Test
    void fromEmployeesResponseDomain() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<EmployeeMapper> constructor = EmployeeMapper.class.getDeclaredConstructor();
        Assertions.assertTrue(Modifier.isPublic(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();

        final List<EmployeeDTO> cityDTOS = EmployeeMapper.fromEmployeeListDomainToDTO(employeeList);
        assertThat(cityDTOS).isNotNull();
        Assertions.assertTrue(Modifier.isPublic(constructor.getModifiers()));
        Assertions.assertSame(employeeList.get(0).getDocumentId().getDocumentId(),cityDTOS.get(0).getDocumentId());
        Assertions.assertSame(employeeList.get(1).getName().getName(),cityDTOS.get(1).getName());
    }

    @Test
    void fromEmployeesToDTO() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<EmployeeMapper> constructor = EmployeeMapper.class.getDeclaredConstructor();
        Assertions.assertTrue(Modifier.isPublic(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();

        final EmployeeDTO employeeDto = EmployeeMapper.fromEmployeeDomainToDTO(employee1);
        assertThat(employeeDto).isNotNull();
        Assertions.assertTrue(Modifier.isPublic(constructor.getModifiers()));
        Assertions.assertSame(employee1.getStartDate().getStartDate(),employeeDto.getStartDate());
        Assertions.assertSame(employee1.getDocumentId().getDocumentId(),employeeDto.getDocumentId());
    }

    @Test
    void fromDtoToDomain() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<EmployeeMapper> constructor = EmployeeMapper.class.getDeclaredConstructor();
        Assertions.assertTrue(Modifier.isPublic(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();

        final Mono<Employee> employeeMono = EmployeeMapper.fromEmployeeDTOToDomain(employeeDTO);
        assertThat(employeeMono).isNotNull();
        Assertions.assertTrue(Modifier.isPublic(constructor.getModifiers()));
        Assertions.assertEquals(employee1.getSalary().getSalary(), Objects.requireNonNull(employeeMono.block()).getSalary().getSalary());
        Assertions.assertEquals(employee1.getDocumentId().getDocumentId(), Objects.requireNonNull(employeeMono.block()).getDocumentId().getDocumentId());
    }



}
