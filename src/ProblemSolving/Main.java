package ProblemSolving;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        int n3= scanner.nextInt();
        int n4= scanner.nextInt();
        System.out.println((n1*n2*n3*n4)%100);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }


}
