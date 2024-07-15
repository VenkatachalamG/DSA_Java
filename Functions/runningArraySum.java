package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class runningArraySum {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] sumArray = arrayRunningSum(arr, n);
        System.out.println("Running Sum :"+ Arrays.toString(sumArray));
    }

    private static int[] arrayRunningSum(int[] arr, int n) {
        int sum;
        int[] sumArray = new int[n];
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            sumArray[i] = sum;
        }
        return sumArray;
    }
}
