package ArrayList;

import java.util.*;

public class Challange1_Enhcmmaned_Sol
{
    private  static Scanner scanner= new Scanner(System.in);
    private  static final ArrayList <String>items= new ArrayList<>();
    static boolean  flag = false;
    public static void main(String[] args)
    {
        textBox();
        while(flag)
        switch (Integer.parseInt(scanner.next())){
            case 1-> addItems(items);
            case 2 -> removeItems(items);
            default -> flag= false;

        }



    }

    public static void addItems (ArrayList items)
    {
        System.out.println("Add your items in a comma delimited list: ");
        String []input=scanner.nextLine().trim().split(",");
        for (String item :input)
        {
            if(!items.contains(input))
                items.add(item);
        }


    }
    public static  void removeItems(ArrayList items)
    {
        System.out.println("Add your items in a comma delimited list: ");
        String []input=scanner.nextLine().trim().split(",");
    }
    public static void textBox(){
        String textBlock= """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:
                """;
        System.out.println(textBlock+" ");
    }


}
