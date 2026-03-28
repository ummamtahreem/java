import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even (if-else example).");
        } else {
            System.out.println(num + " is Odd (if-else example).");
        }

        System.out.print("\nEnter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            if (age >= 60) {
                System.out.println("You are a Senior Citizen (nested if-else example).");
            } else {
                System.out.println("You are an Adult (nested if-else example).");
            }
        } else {
            System.out.println("You are a Minor (nested if-else example).");
        }
        System.out.print("\nEnter your marks (0–100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A (if-else ladder example).");
        } else if (marks >= 75) {
            System.out.println("Grade: B (if-else ladder example).");
        } else if (marks >= 50) {
            System.out.println("Grade: C (if-else ladder example).");
        } else if (marks >= 35) {
            System.out.println("Grade: D (if-else ladder example).");
        } else {
            System.out.println("Grade: Fail (if-else ladder example).");
        }

        sc.close();
    }
}


