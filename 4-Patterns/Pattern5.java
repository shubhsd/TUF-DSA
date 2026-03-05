class Pattern5 {

    // Function to print pattern5
    public static void pattern5(int n) {

        // Outer loop for rows
        for (int i = 0; i < n; i++) {

            // Inner loop for columns
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;

        // Call the method directly (since it is static)
        pattern5(N);
    }
}