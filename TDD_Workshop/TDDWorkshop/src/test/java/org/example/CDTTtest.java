package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CDTTtest {

    @Test
    @DisplayName("Test to show total value")
    //@Disabled
    void testSuccesful() throws ExceptionBusiness {
        //Arrange
        int days = 190;
        int capital = 1_000_000;
        CDT cdt = new CDT(capital,days);

        //Act
        double interestResult = cdt.getTotalValueWithdraw();

        //Assert
        Assertions.assertEquals(1018472.2222222222,interestResult);
    }

    @Test
    @DisplayName("Test to calculate fee with right values")
    void testUpperThreeMillion() throws ExceptionBusiness {
        //Arrange
        int days = 190;
        int capital = 100_000_000;
        CDT cdt = new CDT(capital,days);

        //Act
        double interestResult = cdt.getTotalValueWithdraw();

        //Assert
        Assertions.assertEquals(101_847_222.22222222,interestResult);
    }


    @Test
    void errorTest(){
        //Arrange
        int dias = 190;
        int capital = -100_000_000;

        //Assert
        Assertions.assertThrows(ExceptionBusiness.class, () ->
                {
                    CDT cdt = new CDT(capital,dias);
                    cdt.getTotalValueWithdraw();
                }

                );

    }

}
