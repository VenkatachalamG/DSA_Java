package Arrays;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4};
        cyclicSorting(arr);
    }

    private static void cyclicSorting(int[] arr) {
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
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
