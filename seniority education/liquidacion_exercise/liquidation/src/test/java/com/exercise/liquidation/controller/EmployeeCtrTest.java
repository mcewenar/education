package com.exercise.liquidation.controller;

import com.exercise.liquidation.controller.dto.EmployeeDTO;
import com.exercise.liquidation.service.EmployeeImp;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Flux;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class EmployeeCtrTest {
    @MockBean
    private EmployeeImp employeeImp;

    @InjectMocks
    private EmployeeCtrTest employeeCtrTest;

    @Test
    void findAllCitiesTest() {
        Flux<EmployeeDTO> citiesResponseDTO = Flux.just(EmployeeDTO.builder()
                        .documentId(2)
                        .name("dav")
                        .startDate(LocalDate.of(2015,3,3))
                        .position("dev")
                        .salary(1500000)
                .build());

        when(employeeImp.findAllEmployees())
                .thenReturn(citiesResponseDTO);
        Flux<EmployeeDTO> resultado = employeeCtrTest.employeeImp.findAllEmployees();

        assertEquals(resultado, citiesResponseDTO);
        assertNotNull(resultado);
    }
}
