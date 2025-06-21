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

        // JVM Bytecode equivalent for doKitchenWork():
        // 0: aload_0          // Load 'this' onto stack
        // 1: getfield         // Get brewMaster field
        // 4: invokevirtual    // Call brewCoffee() method
        // 7: aload_0          // Load 'this' onto stack
        // 8: getfield         // Get iceBox field
        // 11: invokevirtual   // Call orderFood() method
        // 14: aload_0         // Load 'this' onto stack
        // 15: getfield        // Get dishWasher field
        // 18: invokevirtual   // Call doDishes() method
        // 21: return          // Return from method

    }
}
