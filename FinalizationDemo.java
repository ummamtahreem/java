class Demo {
    private String name;
    Demo(String name) {
        this.name = name;
        System.out.println("Object " + name + " created.");
    }
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called for object: " + name);
    }
}
public class FinalizationDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo("U");
        Demo d2 = new Demo("A");
        d1 = null;
        d2 = null;
        System.gc();

        System.out.println("Main method completed.");
    }
}
