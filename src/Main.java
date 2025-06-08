import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfFrinds = scanner.nextInt();
        int wallwhight = scanner.nextInt();
int finaloput=0;
        for(int i=0 ; i<numberOfFrinds;i++){
            int fh= scanner.nextInt();
            if(fh>wallwhight)
                finaloput+=2;
            else
                finaloput+=1;

        }

        System.out.println(finaloput);
    }
}