package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class richestCustomer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {4,3,1},
                {5,3,8}
        };
        int wealth = richCustomer(arr);
        System.out.println("Richest Wealth :"+wealth);
    }

    static int richCustomer(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] i : arr) {
            int sum  = 0;
            for (int j : i ) {
                sum += j;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
