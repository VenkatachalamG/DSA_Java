package TwoDArray;

public class searchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};
        int target = 3;
        boolean ans = isFoundIn2DArray(arr, target);
        System.out.println(ans);
    }

    private static boolean isFoundIn2DArray(int[][] arr, int target) {
        if (arr.length == 0){
            return false;
        }
        int row = 0, col = arr[0].length - 1;
        while (row < arr.length && col >= 0){
            if (arr[row][col] == target){
                return true;
            }
            else if (arr[row][col] > target){
                col--;
            }
            else if (arr[row][col] < target){
                row++;
            }
        }
        return false;
    }
}
