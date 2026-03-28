class Vehicle {
    void fuelType() {
        System.out.println("Vehicles use fuel");
    }
}
class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car runs on Petrol or Diesel");
    }
}
class Bike extends Vehicle {
    void fuelType() {
        System.out.println("Bike runs on Petrol");
    }
}
class Truck extends Vehicle {
    void fuelType() {
        System.out.println("Truck runs on Diesel");
    }
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== First Output (Parent class method) ===");
        Vehicle v1 = new Vehicle();
        v1.fuelType();
        System.out.println("\n=== Second Output (Overridden child methods) ===");
        Vehicle v;
        v = new Car();
        v.fuelType();
        v = new Bike();
        v.fuelType();
        v = new Truck();
        v.fuelType();
    }
}
