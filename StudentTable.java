import java.util.*;

class Student {
    String name;
    int age;
    String course;
    int rollNo;
    Student(String name, int age, String course, int rollNo) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.rollNo = rollNo;
    }

    // ✅ Display method
    void display() {
        System.out.printf("%-10s %-5d %-10s %-5d\n", name, age, course, rollNo);
    }
}

public class StudentTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ✅ Create ArrayList of students
        ArrayList<Student> students = new ArrayList<>();

        // ✅ Add some students
        students.add(new Student("Amit", 20, "Bachelor", 101));
        students.add(new Student("Rahul", 22, "Master", 103));
        students.add(new Student("Sneha", 19, "Bachelor", 102));
        students.add(new Student("Kiran", 23, "Master", 104));

        int choice;
        do {
            System.out.println("\nHow do you want to sort the table?");
            System.out.println("1. Name (A-Z)");
            System.out.println("2. Name (Z-A)");
            System.out.println("3. Age (Smallest to Greatest)");
            System.out.println("4. Age (Greatest to Smallest)");
            System.out.println("5. Roll No (Ascending)");
            System.out.println("6. Roll No (Descending)");
            System.out.println("7. Course (Bachelor to Master)");
            System.out.println("8. Course (Master to Bachelor)");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    students.sort(Comparator.comparing(s -> s.name));
                    break;
                case 2:
                    students.sort((a, b) -> b.name.compareTo(a.name));
                    break;
                case 3:
                    students.sort(Comparator.comparingInt(s -> s.age));
                    break;
                case 4:
                    students.sort((a, b) -> b.age - a.age);
                    break;
                case 5:
                    students.sort(Comparator.comparingInt(s -> s.rollNo));
                    break;
                case 6:
                    students.sort((a, b) -> b.rollNo - a.rollNo);
                    break;
                case 7:
                    students.sort((a, b) -> a.course.compareTo(b.course));
                    break;
                case 8:
                    students.sort((a, b) -> b.course.compareTo(a.course));
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }

            // ✅ Display table
            System.out.println("\nName       Age   Course     RollNo");
            System.out.println("----------------------------------");
            for (Student s : students) {
                s.display();
            }

        } while (choice != 9);

        sc.close();
    }
}
