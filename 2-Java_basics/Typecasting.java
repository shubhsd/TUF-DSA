public class Typecasting {
    public static void main(String[] args) {
        // Implicit typecasting
        int x = 10;
        double y = x;
        System.out.println(y);   
        // Above one will be easily typecasted and we will get output as 10.0
        // If say i do double x and int y then we will get error by compiler

        // double a = 10.7;
        // int b = a;
        // System.out.println(b);

        // To handle this error we do explicait typecasting

        double c = 10.45;
        int d = (int)c;
        System.out.println(d);
        // Explicit typecasting
    }
}
