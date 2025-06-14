package oop.Composition.ComputerFactory;

public class PersonalComputer extends Product {
    // Composition: PersonalComputer HAS these components
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // Getter methods to access composed objects
    public ComputerCase getComputerCase() { return computerCase; }
    public Monitor getMonitor() { return monitor; }
    public Motherboard getMotherboard() { return motherboard; }
}

