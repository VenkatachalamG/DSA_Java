package Arrays;
import java.util.Arrays;

public class sortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = squareSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] squareSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int last = n - i - 1;
            int maxElement = getMaximum(arr, 0 , last);

            swapElement(arr, maxElement, last);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
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
            if (arr[j] * arr[j] > arr[max] * arr[max]){
                max = j;
            }
        }
        return max;
    }
}
