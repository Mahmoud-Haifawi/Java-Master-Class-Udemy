package oop.inheritance.challenge1;

public class SalariedEmployee extends Employee
{
    private double  annualSalary ;
    private boolean isRetired;

    public boolean isRetired() {
        return isRetired;
    }

    public SalariedEmployee(String name, String birthDate, String hireDate, boolean isRetired, double annualSalary) {
        super(name, birthDate, hireDate);
        this.isRetired = isRetired;
        this.annualSalary = annualSalary;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void retire(){
        super.setEndDate("0/01/2026");
        super.terminate(getEndDate());
        isRetired=true;

    }
    @Override
    public double collectPay() {

        double yearlySalery= annualSalary/26;
        return (isRetired()?yearlySalery*06:yearlySalery);
    }



}
