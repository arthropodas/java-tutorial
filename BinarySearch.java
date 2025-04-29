import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] array = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at index " + i + ":");
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        // Sort the array
        Arrays.sort(array);

        // Call binary search
        int index = binarySort(array, target, 0, array.length - 1);

        // Output result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }

    // Binary search (recursive)
    public static int binarySort(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (target > array[mid]) {
            return binarySort(array, target, mid + 1, end);
        } else {
            return binarySort(array, target, start, mid - 1);
        }
    }
}
