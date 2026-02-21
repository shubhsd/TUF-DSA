// Problem : Take age input, if age > 18 print adult otherwise teen
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        if(age >= 18) {
            System.out.println("Adult");
        }else{
            System.out.println("Teen");
        }
        scn.close();
    }
}
