package OneDArray;

import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = {-1,-1};
        ans[0] = findFirstAndLast(arr, target, true);
        if(ans[0] != -1){
            ans[1] = findFirstAndLast(arr, target, false);
        }
        System.out.println(Arrays.toString(ans));
    }

    static int findFirstAndLast(int[] arr, int target, boolean firstOccurence) {
        int start = 0, end = arr.length - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstOccurence) {
                    end = mid  -1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
