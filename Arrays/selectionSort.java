package Arrays;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {-8,-3,5,0,-31,2};
        int[] res = selectionSorting(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] selectionSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int last = n - i - 1;
            int maxElement = getMaximum(arr, 0 , last);

            swapElement(arr, maxElement, last);
        }
        return arr;
    }

    static void swapElement(int[] arr, int element1, int element2) {
        int temp = arr[element1];
        arr[element1] = arr[element2];
        arr[element2] = temp;
    }

    static int getMaximum(int[] arr, int start, int end) {
        int max = 0;
        for (int j = start; j <= end; j++) {
            if (arr[j] > arr[max]){
                max = j;
            }
        }
        return max;
    }
}
