package oop.Composition.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        // From Lecture: Creating individual components
        ComputerCase thecase = new ComputerCase("2208", "Dell", "240");
        Monitor monitor = new Monitor("27 inch beast", "Acer", 27, "2540x1440");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "V2.44");

        // From Lecture: Assembling via composition
        PersonalComputer pc = new PersonalComputer("2208", "Dell", thecase, monitor, motherboard);

        // From Lecture: Accessing parts directly ( this break encapulsation , where the pc object should internally manage its part and no
        // class should access nor modify it parts )
        pc.getMonitor().drawPixelAt(10, 10, "red");
        pc.getMotherboard().loadProgram("Windows OS");
        pc.getComputerCase().pressPowerButton();

     // From Lecture: Clean client code , where the user doesnt know the  internal parts of the pc
        pc.powerUp();

        /*
        🎯 Critical Point:
        "As a general rule,
         when you're designing your programs in Java, you probably want to look at composition first.
          Most of the experts will tell you that as a rule, look at using composition before implementing inheritance.
        * */
    }
}

