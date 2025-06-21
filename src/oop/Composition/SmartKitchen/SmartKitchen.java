package oop.Composition.SmartKitchen;

public class SmartKitchen
{

        private CoffeeMaker brewMaster;
        private Refrigerator iceBox;
        private DishWasher dishWasher;

        // Constructor creates all appliances
        public SmartKitchen() {
            brewMaster = new CoffeeMaker();
            iceBox = new Refrigerator();
            dishWasher = new DishWasher();
        }

        // Getter methods for direct access
        public CoffeeMaker getBrewMaster() { return brewMaster; }
        public Refrigerator getIceBox() { return iceBox; }
        public DishWasher getDishWasher() { return dishWasher; }

        // Unified state setting method
        public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishwasherFlag) {
            brewMaster.setHasWorkToDo(coffeeFlag);
            iceBox.setHasWorkToDo(fridgeFlag);
            dishWasher.setHasWorkToDo(dishwasherFlag);
        }

        // Unified work execution method
        public void doKitchenWork() {
            brewMaster.brewCoffee();
            iceBox.orderFood();
            dishWasher.doDishes();
        }



}
