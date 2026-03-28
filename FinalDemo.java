final class Vehicle {
    final int wheels = 4;
    public final void showDetails() {
        System.out.println("This vehicle has " + wheels + " wheels.");
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("Number of wheels: " + v.wheels);
        v.showDetails();
  }
}
