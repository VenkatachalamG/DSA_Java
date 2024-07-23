package Arrays;

import java.util.Arrays;

public class smallestPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3};
        int ans = smallestPositive(arr);
        System.out.println(ans);
    }

    static int smallestPositive(int[] arr){
        int i = 0;

        while (i < arr.length){
            int element = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[element]) {
                swap(arr, i, element);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
