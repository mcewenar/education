package com.exercise.liquidation.controller;

import com.exercise.liquidation.controller.dto.EmployeeDTO;
import com.exercise.liquidation.model.EmployeeMapper;
import com.exercise.liquidation.model.exception.CustomException;
import com.exercise.liquidation.service.EmployeeImp;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/liquidation")
@Log
public class EmployeeCtr {

    private final EmployeeImp employeeImp;

    @GetMapping(value = "/employees", consumes = {"text/plain", "application/*"})
    public Mono<List<EmployeeDTO>> employees() {
        log.info("getting all employees");
        return employeeImp.findAllEmployee()
                .switchIfEmpty(Mono.error(new CustomException("No se encontro informacion en la busqueda.")));
    }

    @PostMapping(value = "/employee", consumes = {"text/plain", "application/*"})
    public Mono<EmployeeDTO> postEmployee(@Valid @RequestBody EmployeeDTO employeeDTO){
        log.info("getting all employees");
        return employeeImp.createEmployee(EmployeeMapper.fromEmployeeDTOToDomain(employeeDTO))
                .doOnError(exc -> Mono.error(new CustomException("error al crear " + employeeDTO)));
        //return new ResponseEntity<>(String.format("OBJECT WITH CC %s wasn't created!",employeeDTO.getAuthorCc().getAuthorCCM()), HttpStatus.CONFLICT);

    }

    /*@PostMapping("/employees")
    public Mono<List<EmployeeDTO>> postEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
        log.info("getting all employees");
        return employeeImp.findAllEmployee()
                .switchIfEmpty(Mono.error(new CustomException("No se encontro informacion en la busqueda.")));
    }

     */
}
