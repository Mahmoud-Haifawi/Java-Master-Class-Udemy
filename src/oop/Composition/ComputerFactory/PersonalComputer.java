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
    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    // Getter methods to access composed objects
    public ComputerCase getComputerCase() { return computerCase; }
    public Monitor getMonitor() { return monitor; }
    public Motherboard getMotherboard() { return motherboard; }
    // From Lecture: Hidden implementation

        private void drawLogo() {
            monitor.drawPixelAt(1200, 50, "yellow");
        }

        public void powerUp() {
            computerCase.pressPowerButton();
            drawLogo();
        }




}


