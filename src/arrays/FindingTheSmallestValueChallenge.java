package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingTheSmallestValueChallenge
{
    public static void main (String ... args)
    {
       int [] userInput = readIntegers();
        System.out.println(Arrays.toString(userInput));

        int minvalue = findMin(userInput);
        System.out.println(" min =" + minvalue);

    }
    public static int [] readIntegers ()
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String []arry = input.split(",");
        int [] intArray= new int [arry.length];
        for (int i = 0; i <arry.length ; i++)
        {
            intArray [i]= Integer.parseInt(arry[i].trim());
        }
        return intArray;

    }

    public static int  findMin (int []args)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <args.length-1 ; i++)
        {
            if(args[i]<min)
               min=args[i];


        }
        return  min;
    }

}
