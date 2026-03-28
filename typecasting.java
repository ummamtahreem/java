public class typecasting {
    public static void main(String[] args) {
        int intNum = 100;
        double doubleNum = intNum; 

        System.out.println("Implicit Type Casting (Widening):");
        System.out.println("Integer value: " + intNum);
        System.out.println("Converted to double: " + doubleNum);
        double originalDouble = 99.99;
        int convertedInt = (int) originalDouble;  

        System.out.println("\nExplicit Type Casting (Narrowing):");
        System.out.println("Double value: " + originalDouble);
        System.out.println("Converted to int: " + convertedInt);
    }
}


