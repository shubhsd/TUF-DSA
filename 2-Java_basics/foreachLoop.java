
import java.util.Scanner;

public class foreachLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<=size-1; i++) {
            arr[i] = scn.nextInt();
        }
        // FOR EACH LOOP ->
        for(int num:arr) {
            System.out.println(num + " ");
        }

        scn.close();
    }
}
