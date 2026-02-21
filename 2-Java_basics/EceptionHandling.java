// Exception handling
public class EceptionHandling {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int num3 = num1/num2;
            // 10/0 is mathematically not possible, so next line won't be printed
            System.out.println(num3);
        } catch (Exception e) {
            System.out.println("Inside exception-> " + e);
        } finally {
            System.out.println("DONE");
        }
    }
}

// Finally block is always executed, no matter if there is exception or not
