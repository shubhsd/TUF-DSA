class Sum {
    public int sum(int int1, int int2) {
        return int1 + int2;
    }
}

public class ParameterizedFunctions {
    public static void main(String[] args) {
       Sum sum = new Sum();
       System.out.println(sum.sum(10, 20)); 
    }
}
