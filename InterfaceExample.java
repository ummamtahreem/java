interface Animal {
    void eat();
    void sleep();
}
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones.");
    }
    public void sleep() {
        System.out.println("Dog sleeps in its kennel.");
    }
}
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats fish.");
    }
    public void sleep() {
        System.out.println("Cat sleeps on a couch.");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Animal d = new Dog(); 
        Animal c = new Cat();

        d.eat();
        d.sleep();

        c.eat();
        c.sleep();
    }
}
