import java.util.Scanner;
import ArrayUtils.*;

public class BubbleSort {

    int[] bubble_sort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    ArrayUtils.swap(arr, j - 1, j);
                }
            }
        }
        return arr;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        BubbleSort bs = new BubbleSort();
        int[] res = bs.bubble_sort(arr, arr.length);
        ArrayUtils.print_arr(res);

    }
}
