// Base class
class Vehicle {
    String numberOfVehicle;
    public Vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk() {
        System.out.println("Honk !!!!!!!!");
    }

    public void printNumberOfCar() {
        System.out.println(numberOfVehicle);
    }
}

// Derived class -> classes that will use or base class

class Car extends Vehicle {
    public Car(String numberOfCar) {
        super(numberOfCar);
    }

    @Override
    public void honk() {
        System.out.println("New honk peep peep");
    }
}

class Bus extends Vehicle {
    public Bus(String numberOfBus) {
        super(numberOfBus);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car("HP 01 0001");
        car.printNumberOfCar();
        car.honk();

        Bus bus = new Bus("HP 01 BUS1");
        bus.printNumberOfCar();
        bus.honk();
    }
}

