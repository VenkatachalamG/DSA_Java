package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class repetitionDeletion {
    public static void main(String[] args) {
        int[] arr = {4,2,3,7,8,2,3,1};
        int[] ans = findDuplicates(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] findDuplicates(int[] arr) {
        int i = 0;

        while (i < arr.length){
            int element = arr[i] - 1;
            if (arr[i] != arr[element]) {
                swap(arr, i, element);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[]{arr[j], j + 1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
