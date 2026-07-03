import java.util.Scanner;

public class MixedArray.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Object[] arr = new Object[8];

        System.out.println("Enter 8 values (words or integers):");

        for (int i = 0; i < 8; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();   // Store as Integer
            } else {
                arr[i] = sc.next();      // Store as String
            }
        }

        System.out.println("\nStored values:");
        for (Object value : arr) {
            System.out.println(value);
        }

        sc.close();
    }
}
