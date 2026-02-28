public class lastChar {

    // Function to return the last character of the string
    public char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {

        // Creating an instance of lastChar class
        lastChar sol = new lastChar();

        String s = "example";

        // Function call
        char ans = sol.lastChar(s);

        System.out.println("The last character is: " + ans);
    }
}