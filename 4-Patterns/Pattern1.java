public class Pattern1 {
    // Function to print pattern1
    public void pattern1(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 4;

        // Correct object creation
        Pattern1 sol = new Pattern1();

        sol.pattern1(N);
    }
}
