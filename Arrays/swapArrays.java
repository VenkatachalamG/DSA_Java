package Arrays;

import java.util.Arrays;

public class swapArrays {
    public static void main(String[] args) {
        int[] arr = {5,85,14,2,97};
        int i = 0;
        int j = arr.length - 1;
        System.out.println("Original Array :"+ Arrays.toString(arr));
        System.out.print("Swapped Array : ");
        swapArr(arr, i, j);
    }

    static void swapArr(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
