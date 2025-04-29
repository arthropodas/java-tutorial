
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {3, 2, 41, 5, 1};
        int size = a.length;
       
        int temp;
        for (int i = 0; i < size - 1; i++) {
             int minIndex=i;
            for (int j = i+1; j < size; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }

            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
            for (int k = 0; k < size; k++) {
                System.out.print(" " + a[k]);

            }
            System.out.println(" ");
        }
        System.out.println(" after sorting");
        for (int k = 0; k < size; k++) {
            System.out.println(" " + a[k]);

        }

    }
}
