public class Pattern3 {
    // Function to print pattern3
    public static void pattern3(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;

        pattern3(N); // Directly call static method
    }
}