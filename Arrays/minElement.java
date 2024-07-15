package Arrays;

import java.util.Arrays;

// Linear Search to find a minimum element
public class minElement {
    public static void main(String[] args) {
        int[] arr = {45,78,32,14,5,69,82,12,199,7, 2};
        System.out.println("Given array :"+ Arrays.toString(arr));
        int mini = minElementInArray(arr);
        System.out.println("Minimum element :"+mini);
        int maxi = maxElementInArray(arr);
        System.out.println("Maximum element :"+maxi);
    }

    private static int maxElementInArray(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int ele : arr){
            if (ele > maxi){
                maxi = ele;
            }
        }

        return maxi;
    }

    private static int minElementInArray(int[] arr) {
        int mini = Integer.MAX_VALUE;

        for(int ele : arr){
            if (ele < mini){
                mini = ele;
            }
        }

        return mini;

    }
}
