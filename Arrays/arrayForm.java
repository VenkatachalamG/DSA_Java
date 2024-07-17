package Arrays;
import java.util.Arrays;

import static java.lang.Math.pow;

public class arrayForm {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int k = 999;
        int[] ans = arrayFormOfInteger(arr, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] arrayFormOfInteger(int[] arr, int k) {
        int n  = arr.length, sum = 0;
        if (n == -1){
            return new int[]{-1};
        }
        for (int num : arr) {
            sum += (int)(num * (pow(10, n - 1)));
            n = n -1;
        }
        int newNumber = sum + k;
        int i = 0, dig = (int)(Math.log10(newNumber) + 1);
        int[] newArray = new int[dig];
        while (newNumber > 0){
            newArray[i] = (int) (newNumber / Math.pow(10, dig - 1));
            dig--;
            newNumber = (int) (newNumber % Math.pow(10,dig));
            i++;
        }
        return newArray;
    }
}
