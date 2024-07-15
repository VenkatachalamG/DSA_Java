package Arrays;
import java.util.Arrays;
public class max2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,25,14,3},
                {12,45,4,30},
                {77,31,74,87}
        };

        int target = 450;

        int[] ans = maxIn2DArray(arr, target);
        System.out.println("Target found at :"+Arrays.toString(ans));
    }

    private static int[] maxIn2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
