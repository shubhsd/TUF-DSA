// Static keyword and creating object

public class OOPS {
    static class Test {
        //Function with static keyword - we can directly call it by using class name.function name
        public static void printHello() {
            System.out.println("Hello world");
        }
    }

    // Function without static keyword - In this case we cannot call the defined function with class name.function name as we will get error non-static method printWorld() cannot be referenced from a static context
    // So in such cases we create a new object out of that class

    static class NonStaticFunction {
        public void printWorld() {
            System.out.println("world");
        }
    }
    public static void main(String[] args) {
        // Directly calling printHello function here as function was static
        // Test.printHello();
        NonStaticFunction test = new NonStaticFunction();
        test.printWorld();
    }
}
