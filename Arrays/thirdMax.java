package Arrays;
import java.util.Arrays;


public class thirdMax {
    public static void main(String[] args) {
        int[] arr = {7,8,8};
        int ans = thirdMaximumNumber(arr);
        System.out.println(ans);
    }

    static int thirdMaximumNumber(int[] arr){
        bubbleSorted(arr);
        System.out.println(Arrays.toString(arr));

        if (arr.length < 3){
            return arr[arr.length - 1];
        }
        Integer lastSeen = null;
        int distinctCount = 0;

        // Iterate from the end of the sorted array
        for (int i = arr.length - 1; i >= 0; i--) {
            if (lastSeen == null || arr[i] != lastSeen) {
                distinctCount++;
                lastSeen = arr[i];
            }
            if (distinctCount == 3) {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    static void bubbleSorted(int[] arr) {
        boolean swapOcurred;
        int n = arr.length;
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            swapOcurred = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapOcurred = true;
                }
            }
            if (!swapOcurred) {
                break;
            }
        }
    }

}

