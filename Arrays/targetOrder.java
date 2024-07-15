package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
public class targetOrder {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n], index = new int[n];
        System.out.println("Enter the elements array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the indices array");
        for (int i = 0; i < n; i++) {
            index[i] = in.nextInt();
        }

        ArrayList<Integer> target = targetArray(arr,index);
        System.out.println("Result :"+ target);
    }

    private static ArrayList<Integer> targetArray(int[] arr, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(index[i], arr[i]);
        }
        return list;
    }
}
