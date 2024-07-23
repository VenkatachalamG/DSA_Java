package Arrays;

import java.util.Arrays;

public class missingElement {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        int ans = missingCyclicSorting(arr);
        System.out.println(ans);
    }

    private static int missingCyclicSorting(int[] arr) {
        int i = 0;

        while (i < arr.length){
            int element = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[element]) {
                swap(arr, i, element);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
