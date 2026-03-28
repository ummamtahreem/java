class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor called!");
    }
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor called!");
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        System.out.println();
        Student s2 = new Student("Alice", 20);
        s2.display();
    }
}


