package oop.Encapsualtion.Challenges;

public class Main
{
    public static void main(String []args )
    {
        Printer printer = new Printer(5,true);
        System.out.println(printer.addToner(200) );
        System.out.println(printer.addToner(5) );
        System.out.println(printer.toString());

         Printer printer2 = new Printer(5,false);
        System.out.println(printer2.addToner(200) );
        System.out.println(printer2.addToner(5) );
        System.out.println(printer2.printPages(5) );

        System.out.println(printer2.toString());
}
}
