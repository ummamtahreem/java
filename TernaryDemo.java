import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter a number: ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);

        System.out.print("\nEnter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);

        sc.close();
    }
}
