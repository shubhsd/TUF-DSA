// PROB: Take number input. and return summation of all such numbers

// HINT: SInce we have to store the numbers so we need a container so we can store data here in an array.
import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        // Taking input in an array
        for(int i = 0; i<=size-1; i++) {
           arr[i] = scn.nextInt(); 
        }

        // Printing array
        for(int i = 0; i<=size-1; i++) {
           System.out.println(arr[i]); 
        } 

        // Sum of array
        int sum = 0;
        for(int i = 0; i<=size-1; i++) {
           sum = sum + arr[i]; 
        }  
        System.out.println(sum);     
        scn.close();
    }
}
