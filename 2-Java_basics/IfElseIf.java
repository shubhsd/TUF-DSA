
import java.util.Scanner;

class Solution {
    // Function to print the grades based on marks
    public void studentGrade(int marks) {
        
        // If else ladder
        if (marks >= 90) {
            System.out.print("Grade A");
        } else if (marks >= 70) {
            System.out.print("Grade B");
        } else if (marks >= 50) {
            System.out.print("Grade C");
        } else if (marks >= 35) {
            System.out.print("Grade D");
        } else {
            System.out.print("Fail");
        }
    }
}

class IfElseIf {
    public static void main(String[] args) {
        // Creating an instance of Solution class
        Solution solution = new Solution();
        int marks;

        // Taking marks as input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        marks = sc.nextInt();

        // Function call to print the grades based on marks
        solution.studentGrade(marks);
        sc.close();
    }
}