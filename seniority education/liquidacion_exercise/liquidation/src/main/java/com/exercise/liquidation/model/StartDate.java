package com.exercise.liquidation.model;

import com.exercise.liquidation.model.exception.CustomException;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import java.util.Objects;

@Data
@NoArgsConstructor
public class StartDate {

    private LocalDate startDate;

    public StartDate(LocalDate startDate) {
        Objects.requireNonNull(startDate, "startDate can not be null");
        this.startDate = startDate;
        dateLimits();
    }

    private void dateLimits() {
        LocalDate minDate = LocalDate.of(2015, 1, 1);
        LocalDate maxDate = LocalDate.of(2015, 6, 6);

        if(startDate.isAfter(maxDate) || startDate.isBefore(minDate)) {
            throw new CustomException("startDate cannot after 2015-06-06 or before 2015-01-01");
        }


    }
}
