class Calculator {
    int a, b;
    Calculator() {
        a = 0;
        b = 0;
        System.out.println("Default Constructor called!");
    }
    Calculator(int x) {
        a = x;
        b = 0;
        System.out.println("Constructor with one parameter called!");
    }
    Calculator(int x, int y) {
        a = x;
        b = y;
        System.out.println("Constructor with two parameters called!");
    }
    void add() {
        System.out.println("Sum = " + (a + b));
    }
    void add(int x, int y) {
        System.out.println("Sum = " + (x + y));
    }
    void add(int x, int y, int z) {
        System.out.println("Sum = " + (x + y + z));
    }
}
public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();       
        Calculator c2 = new Calculator(10);     
        Calculator c3 = new Calculator(10, 20); 
        System.out.println();
        c3.add();              
        c3.add(5, 15);          
        c3.add(2, 4, 6);      
    }
}
