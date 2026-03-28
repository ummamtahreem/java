public class shape {
    // area of circle
    void area(double r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    // area of rectangle
    void area(int l, int b) {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    // area of triangle
    void area(double b, double h) {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(5);          // circle
        s.area(4, 6);       // rectangle
        s.area(5.0, 8.0);   // triangle
    }
}
 
    

