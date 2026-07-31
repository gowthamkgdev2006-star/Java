import java.util.*;
public class ArraySort {
    static int sort(int arr[]){
        Arrays.sort(arr);

        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {

    System.out.println("\nIteration: " + i);
    System.out.println("Current Element: " + arr[i]);
    System.out.println("Previous + 1: " + (arr[i - 1] + 1));

    arr[i] = Math.min(arr[i], arr[i - 1] + 1);

    System.out.println("Array: " + Arrays.toString(arr));
}
        
        return arr[arr.length - 1];
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        int result = sort(arr);
        System.out.println("Final Array: " + Arrays.toString(arr));
        System.out.println("Result: " + result);
    }
}
