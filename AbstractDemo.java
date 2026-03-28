
abstract class Shape {
    abstract void draw();
     void display() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        c.display();
        c.draw();
        r.display();
        r.draw();
    }
}
