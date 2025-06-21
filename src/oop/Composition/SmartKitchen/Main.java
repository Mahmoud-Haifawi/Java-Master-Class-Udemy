package oop.Composition.SmartKitchen;

public class Main {

    public static void main (String[] args)
    {


        /*

          Direct Access Pattern:
        *
        * */
        SmartKitchen kitchen = new SmartKitchen();
// Set states directly
        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);
// Execute work directly
        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();

        /*
        *
        * Encapsulated pattern
        *
        */

        SmartKitchen kitchen2 = new SmartKitchen();
// Set states through unified method
        kitchen2.setKitchenState(true, false, true);
// Execute all work through unified method
        kitchen2.doKitchenWork();
    }
}
