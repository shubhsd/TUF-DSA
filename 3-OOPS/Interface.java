interface Animal {
    void bark();
    default void sleep() {
        System.out.println("Sleeping....");
    }

    // static void sleep() {
    //     System.out.println("Sleeping....");
    // }
    // Writing it like this will directly help us to call Animal.sleep()
}
interface Pet {
    void ownerName();
}

class Dog implements Animal, Pet {
    public void bark() {
        System.out.println("Bark....");
    }
    public void ownerName() {
        System.out.println("Test name");
    }

    public void sleep() {
        System.out.println("Sleeping....");
    }
}

class Cat implements Animal {
        public void bark() {
        System.out.println("Mwoowww....");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Animal.sleep(); //Not accessible as we have default value if we use static then we can call this        
        Dog dog = new Dog();
        dog.bark();
        dog.sleep();
        dog.ownerName();

        Cat cat = new Cat();
        cat.bark();
        cat.sleep();
    }
}
