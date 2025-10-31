package ProblemSolving;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int nnum = scanner.nextInt();
        int orgginal=nnum;
        int rev=0;

       while(nnum!=0)
       {
           rev=(rev*10)+nnum%10;
           nnum=nnum/10;

       }
        System.out.println(rev);
       if(rev==orgginal){
           System.out.println("YES");
       }
       else
           System.out.println("NO");

}
}
/*
   long pN=0;
        long nN=0;
        long evens=0;
        long odds=0;

        long n2=0;
        for(long i=0;i<n1;i++)
        {
            n2= scanner.nextLong();
            if(n2%2==0)
                evens++;
            else
                odds++;
            if(n2<0){
                nN++;}
            else {
                if(n2!=0){
                pN++;}
            }


        }

        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
        System.out.println("Positive: " + pN);
        System.out.println("Negative: " + nN);


    }   long pN=0;
        long nN=0;
        long evens=0;
        long odds=0;

        long n2=0;
        for(long i=0;i<n1;i++)
        {
            n2= scanner.nextLong();
            if(n2%2==0)
                evens++;
            else
                odds++;
            if(n2<0){
                nN++;}
            else {
                if(n2!=0){
                pN++;}
            }


        }

        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
        System.out.println("Positive: " + pN);
        System.out.println("Negative: " + nN);


    }
* */