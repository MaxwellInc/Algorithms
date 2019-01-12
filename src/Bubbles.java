public class Bubbles {

    //    static int[] arr = new int[]{-2, 0,1,2,3,4,5};
    static int[] arr = new int[]{6, -4, 2, 0, 12, -543, 553};
    static int numberOfIterations = 0;
    static int numberOfSwaps = 0;

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {
            numberOfIterations++;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    numberOfSwaps++;
                }
                numberOfIterations++;
            }
        }

        print();
        reset();

        for (int i = 0; i < arr.length; i++) {
            numberOfIterations++;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[i];
                    arr[i] = temp;
                    numberOfSwaps++;
                }
                numberOfIterations++;
            }
        }

        print();
        reset();

        for (int i = 0; i < arr.length; i++) {
            numberOfIterations++;
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; numberOfIterations++) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
                numberOfSwaps++;
            }
        }

        print();
        reset();

    }

    static void reset() {
        numberOfSwaps = 0;
        numberOfIterations = 0;
        arr = new int[]{6, -4, 2, 0, 12, -543, 553};
    }

    static void print() {
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Iterations : " + numberOfIterations + "\nSwaps : " + numberOfSwaps);
    }

}
