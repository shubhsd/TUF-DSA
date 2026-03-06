class Pattern6 {
    public static void pattern6(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern6(N);   // direct call
    }
}