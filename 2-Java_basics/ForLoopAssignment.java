public class ForLoopAssignment {

    public static void printX(int X, int N) {

        for (int i = 0; i < N; i++) {
            System.out.print(X);

            if (i < N - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int X = 7, N = 5;

        printX(X, N);
    }
}