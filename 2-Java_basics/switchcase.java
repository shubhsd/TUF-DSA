
import java.util.Scanner;

class Solution {
    /* Function to determine the day of 
    the week based on day number */
    public void whichWeekDay(int day) {
        // Check if the day number is valid
        if (day < 1 || day > 7) {
            System.out.print("Invalid");
            return;
        }

        // Print the corresponding day of the week
        switch (day) {
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday"); break;
            case 7: System.out.print("Sunday"); break;
        }
    }
}

public class switchcase {
    public static void main(String[] args) {
        // Creating an instance of Solution class
        Solution sol = new Solution();
        
        Scanner scanner = new Scanner(System.in);
        int day;
        // Taking user input
        System.out.print("Enter the day number: ");
        day = scanner.nextInt();
        
        /* Function call to determine the day 
        of the week based on day number */
        sol.whichWeekDay(day);
    }
}
