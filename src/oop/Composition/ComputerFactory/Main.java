package oop.Composition.ComputerFactory;

public class Main {
    // From Lecture: Creating individual components
    ComputerCase thecase = new ComputerCase("2208", "Dell", "240");
    Monitor monitor = new Monitor("27 inch beast", "Acer", 27, "2540x1440");
    Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "V2.44");

    // From Lecture: Assembling via composition
    PersonalComputer pc = new PersonalComputer("2208", "Dell", thecase, monitor, motherboard);

}
