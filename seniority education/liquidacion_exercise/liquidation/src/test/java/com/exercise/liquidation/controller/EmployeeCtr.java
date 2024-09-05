package com.exercise.liquidation.controller;

import com.exercise.liquidation.controller.dto.EmployeeDTO;
import com.exercise.liquidation.service.EmployeeImp;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class EmployeeCtr {
    @MockBean
    private EmployeeImp employeeImp;

    @InjectMocks
    private EmployeeCtr employeeCtr;

    @Test
    void findAllCitiesTest() {
        List<EmployeeDTO> citiesResponseDTO = List.of(EmployeeDTO.builder()
                        .documentId(2)
                        .name("dav")
                        .startDate(LocalDate.of(2015,3,3))
                        .position("dev")
                        .salary(1500000)
                .build());

        when(employeeImp.findAllEmployees())
                .thenReturn(Mono.just(citiesResponseDTO));
        Mono<List<EmployeeDTO>> resultado = employeeCtr.employeeImp.findAllEmployees()
                .thenReturn(citiesResponseDTO);

        assertEquals(resultado.block(), citiesResponseDTO);
        assertNotNull(resultado);
    }
}
