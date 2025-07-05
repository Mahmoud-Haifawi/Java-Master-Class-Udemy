package oop.Polymorphism.Challange1;

class GasPoweredCar extends Car {
    private double averageKilometersPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerL, int cylinders) {
        super(description);
        this.averageKilometersPerLitre = avgKmPerL;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas -> All " + cylinders + " cylinders are fired up, Ready!");
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas -> usage exceeds the average: " + averageKilometersPerLitre);
    }
}
