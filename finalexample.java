// FinalExample.java

// A final class cannot be inherited
final class Vehicle {
    // A final variable — its value cannot be changed once assigned
    final int wheels = 4;

    // A final method cannot be overridden in a subclass
    final void displayInfo() {
        System.out.println("This is a vehicle with " + wheels + " wheels.");
    }
}

/*
// ❌ This will cause an error because final classes cannot be extended
class Car extends Vehicle {
    void displayInfo() {
        System.out.println("This is a car.");
    }
}
*/

public class finalexample {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displayInfo();

        // Trying to modify a final variable will cause a compilation error
        // v.wheels = 6; // ❌ Not allowed

        System.out.println("Final class, final method, and final variable demonstrated successfully.");
    }
}
