package Arrays;

public class highestAltitude {
    public static void main(String[] args) {
        int[] arr = {};
        int ans = highestAlt(arr);
        System.out.println(ans);
    }

    private static int highestAlt(int[] arr) {
        int maxAlt = 0, sum = 0;
        if (arr.length == 0){
            return 0;
        }

        if (arr.length == 1){
            if (arr[0] >= 0){
                return arr[0];
            }
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxAlt){
                maxAlt = sum;
            }
        }
        return maxAlt;
    }
}
