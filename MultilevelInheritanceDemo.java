class Animal {
    String name = "Animal";
    Animal() {
        System.out.println("Animal constructor called");
    }
    void sound() {
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal {
    String name = "Dog";
    Dog() {
        super(); 
        System.out.println("Dog constructor called");
    }
    void sound() {
        super.sound(); 
        System.out.println("Dogs bark");
    }
    void showName() {
        System.out.println("Parent name: " + super.name); 
        System.out.println("Child name: " + name);
    }
}
class Puppy extends Dog {
    Puppy() {
        super(); 
        System.out.println("Puppy constructor called");
    }
    void sound() {
        super.sound();
        System.out.println("Puppies yelp");
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();   
        p.sound();               
        p.showName();           
    }
}

