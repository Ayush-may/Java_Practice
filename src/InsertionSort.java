import ArrayUtils.*;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int key = i;
            while (key > 0 && arr[key - 1] > arr[key]) {
                ArrayUtils.swap(arr, key - 1, key);
                key--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Insertion Sort : ");
        ArrayUtils.print_arr(InsertionSort.insertionSort(new int[]{434, 132, 431, 4314, 4, 5, 5, 3, 2}));
    }

}
