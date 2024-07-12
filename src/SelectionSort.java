import ArrayUtils.*;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int currentMin = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[currentMin]) {
                    currentMin = j;
                }

                if (j == size - 1) {
                    ArrayUtils.swap(arr, i, currentMin);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Selection Sort : ");
        ArrayUtils.print_arr(SelectionSort.selectionSort(new int[]{434, 132, 431, 4314, 4, 5, 5, 3, 2}));
    }

}
