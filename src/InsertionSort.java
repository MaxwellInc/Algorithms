import java.util.Arrays;

public class InsertionSort {
    int numberOfIterations = 0;
    int numberOfSwaps = 0;
    int numberOfReads = 0;

    /*Function to sort array using insertion sort*/
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            numberOfIterations++;
            int key = readFromArray(arr, i);
            int j = i - 1;


            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && readFromArray(arr, j) > key) {
                arr[j + 1] = readFromArray(arr, j);
                j = j - 1;
            }
            arr[j + 1] = key;
            numberOfSwaps++;
        }
    }

    private int readFromArray(int[] arr, int i){
        numberOfReads++;
        return arr[i];
    }

    /* A utility function to print array of size n*/
    @Deprecated
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print("Array: " + arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        InsertionSort ob = new InsertionSort();
        int[] arr = new int[]{6, -4, 2, 0, 12, -543, 553};

        ob.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("Number of iterations: " + ob.numberOfIterations + "  "
                + "\nNumber of Swaps: " + ob.numberOfSwaps
                + "\nNumber of Reads: " + ob.numberOfReads);
    }
}
