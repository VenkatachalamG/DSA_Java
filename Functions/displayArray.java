package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class displayArray {
    public static void main(String[] args) {
        int row, col;
        System.out.println("Enter the row and column :");
        Scanner in = new Scanner(System.in);
        row = in.nextInt();
        col = in.nextInt();
        System.out.println("Enter the elements :");
        int[][] arr2D = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2D[i][j] = in.nextInt();
            }
        }

        dispArray(arr2D);

    }

    private static void dispArray(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }
    }
}
