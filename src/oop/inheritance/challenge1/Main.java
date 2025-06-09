package oop.inheritance.challenge1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employee1= new Employee("ali","01/01/2000","01/01/2025");
        System.out.println(employee1.toString());
        System.out.println(employee1.getAge());
        System.out.println("-------------------------------------");

        SalariedEmployee employee2= new SalariedEmployee("ali2","01/01/2000","01/01/2025",false,6000);
        System.out.println(employee2.toString());

        System.out.println(employee2.collectPay());
        employee2.retire();
        System.out.println(employee2.toString());
        System.out.println(employee2.collectPay());


        System.out.println("-------------------------------------");

        HourlyEmployee employee3= new HourlyEmployee("ali3","01/01/2000","01/01/2025",16);
        System.out.println(employee3.toString());
        System.out.println(employee3.collectPay());
        System.out.println(employee3.toString());
        employee3. getDoublePay();
        System.out.println(employee3.toString());
        System.out.println(employee3.collectPay());
        employee3.terminate("01/01/2027");
        System.out.println(employee3.collectPay());
        System.out.println(employee3.toString());


    }
}
