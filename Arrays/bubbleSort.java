package Arrays;
import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {-34,-23,-56,98,23,10,134,17,48};
        int[] res = bubbleSorting(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] bubbleSorting(int[] arr) {
        boolean swapOcurred;
        int n = arr.length;
        if (n== 0){
            return new int[]{};
        }
        for (int i = 0; i < n; i++) {
            swapOcurred = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapOcurred = true;
                }
            }
            if (!swapOcurred){
                break;
            }
        }
        return arr;
    }
}
