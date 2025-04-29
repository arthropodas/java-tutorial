
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {9, 34, 2, 9, 4};
        int size = a.length;
        int key;
        int j;
        for (int i = 1; i < size; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
 
        }
        for (int k = 0; k < size; k++) {
            System.out.println(" " + a[k]);

        }
    }
}
