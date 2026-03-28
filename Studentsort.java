import java.util.*;

class Student {
    String name, course;
    int age, rollNo;

    Student(String name, int age, String course, int rollNo) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.rollNo = rollNo;
    }
}

public class Studentsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student("Ali", 20, "Bachelor", 102);
        Student s2 = new Student("Zara", 22, "Master", 101);
        Student s3 = new Student("Bilal", 19, "Bachelor", 103);

        ArrayList<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3));

        int choice;
        do {
            System.out.println("\n1. Sort by Name");
            System.out.println("2. Sort by Age");
            System.out.println("3. Sort by Roll No");
            System.out.println("4. Sort by Course");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> list.sort(Comparator.comparing(s -> s.name));
                case 2 -> list.sort(Comparator.comparingInt(s -> s.age));
                case 3 -> list.sort(Comparator.comparingInt(s -> s.rollNo));
                case 4 -> list.sort(Comparator.comparing(s -> s.course));
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }

            if (choice >= 1 && choice <= 4) {
                System.out.println("\nName\tAge\tCourse\t\tRollNo");
                for (Student s : list)
                    System.out.println(s.name + "\t" + s.age + "\t" + s.course + "\t" + s.rollNo);
            }
        } while (choice != 5);

        sc.close();
    }
}
