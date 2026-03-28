// Program to demonstrate while, for, and do-while loops
public class LoopDemo {
    public static void main(String[] args) {
        
        // ---------------- while loop ----------------
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println("Count = " + i);
            i++;
        }

        // ---------------- for loop ----------------
        System.out.println("\nUsing for loop:");
        for (int j = 1; j <= 5; j++) {
            System.out.println("Count = " + j);
        }

        // ---------------- do-while loop ----------------
        System.out.println("\nUsing do-while loop:");
        int k = 1;
        do {
            System.out.println("Count = " + k);
            k++;
        } while (k <= 5);
    }
}
