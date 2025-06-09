package oop.inheritance.challenge1;

import java.net.HttpRetryException;

public class HourlyEmployee extends Employee
{
    private double hourlyPayRate;

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }


    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay()
    {
        return 2* collectPay();
    }
    @Override
    public double collectPay() {
        return hourlyPayRate*55;
    }
}
