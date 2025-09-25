package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstLecture
{
    record GroceryItem(String name, String type, int count) {

        // Custom constructor for convenience
        public GroceryItem(String name) {
            this(name, "DAIRY", 1); // Calls default constructor
        }
    }
    public static void main (String [] args)
    {
        // when we dont speice the type of the array list , we are using a row type , means that we are using OBJECT array list type
        // this will make a problem of not checking the added values to the list bc we are using OBJECT type
        ArrayList arrayListRowType= new ArrayList<>();
        arrayListRowType.add("test1");
        arrayListRowType.add(1);
        System.out.println(arrayListRowType.toString());


        // array list that is tied to a type

        ArrayList <GroceryItem> arrayList= new ArrayList<>();
        // these will give me a complie time error bc we TIED THE ARRAY TO A TYPE
       // arrayList.add("test1");
        //  arrayList.add(1);

        arrayList.add(new GroceryItem("apple","name",1));
        System.out.println(arrayList.toString());

        String [] arrayexmaple= new String[] {"test ", "test2"};

        List<String> immutableList = List.of(arrayexmaple);

        immutableList.add("test"); // will give me a run time error , bc using a LIST is a cretation of immuable list

        ArrayList <String> mutableList= new ArrayList<>(List.of(arrayexmaple));
        mutableList.add("test3");

        System.out.println(mutableList.toString());




    }

}
