package org.example;

public class CDT {

    private int capital;
    private int days;
    final double PERCENTAGE_INTEREST = 0.035;
    final double PERCENTAGE_UPPER_THREE = 0.0075;

    public CDT(int capital, int days) throws ExceptionBusiness {
        if(capital < 0 || days < 0) {
            throw new ExceptionBusiness("");
        }
        this.capital = capital;
        this.days = days;
    }

    public double getTotalValueWithdraw() {
        double interest = (this.capital* PERCENTAGE_INTEREST*days)/360;
        return calculateFeeUpperThree(interest);
    }

    private double calculateFeeUpperThree(double interest) {
        if(interest >= 3_000_000) {
            return this.capital+ interest -(PERCENTAGE_UPPER_THREE*interest);
        }
        return capital + interest;
    }
}
