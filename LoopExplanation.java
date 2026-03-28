public class LoopExplanation {
    public static void main(String[] args) {
        System.out.println("WHILE LOOP EXAMPLE:");
        int i = 1;  
        while (i <= 5) {   
            System.out.println("i = " + i);
            i++;  
        }
        System.out.println("\nFOR LOOP EXAMPLE:");
        for (int j = 1; j <= 5; j++) {  
            System.out.println("j = " + j);
        }

        System.out.println("\nDO-WHILE LOOP EXAMPLE:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);  
        System.out.println("\nSPECIAL CASE:");
        int x = 6;

        System.out.println("While loop with x=6:");
        while (x <= 5) {
            System.out.println("This will NOT print because condition is false.");
        }

        System.out.println("Do-while loop with x=6:");
        do {
            System.out.println("This prints ONCE even if condition is false!");
        } while (x <= 5);
    }
}

