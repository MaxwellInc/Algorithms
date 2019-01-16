
import java.util.*;
public class InsertionSort {
    static int numberOfIterations = 0;
    static int numberOfSwaps = 0;
    static int[] arr = new int[]{6, -4, 2, 0, 12, -543, 553};
        /*Function to sort array using insertion sort*/
        void sort(int arr[]) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                numberOfIterations++;
                int key = arr[i];
                int j = i - 1;


            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
                numberOfSwaps++;
            }
        }

        /* A utility function to print array of size n*/
        static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print("Array: "+arr[i] + " ");

            System.out.println();
        }

        // Driver method
        public static void main(String args[]) {
            InsertionSort ob = new InsertionSort();
            ob.sort(arr);

            printArray(arr);
            System.out.println("Number of iterations: "+numberOfIterations +"  "+"\nNumber of Swaps: "+numberOfSwaps);
        }
}
