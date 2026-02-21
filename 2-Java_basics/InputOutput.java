
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Create object of scanner class
        // System.in -> tells to take input
        Scanner scn = new Scanner(System.in);
        // Taking int input
        int num = scn.nextInt();
        // Taking double input
        double doublenum = scn.nextDouble();
        // Taking string input
        String name = scn.nextLine();
        // Show Shubham sood in two different lines i.e split name
        String firstName = scn.next();
        String lastName = scn.next();
        System.out.println(firstName + " " + lastName);
        System.out.println("num->" + num);
        System.out.println("doublenum-> " + doublenum);
        scn.close(); 
    }
}
