package Arrays;

import java.util.ArrayList;
import java.util.List;

public class duplicateInArray {
    public static void main(String[] args) {
        int[] arr = {4,2,3,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);

    }
    public static List<Integer> findDuplicates(int[] arr) {
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
                ans.add(arr[j]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
