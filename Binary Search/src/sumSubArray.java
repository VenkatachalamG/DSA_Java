public class sumSubArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 1;

        int ans = minSubArraySum(arr, m);
        System.out.println(ans);
    }

    private static int minSubArraySum(int[] arr, int m) {
        int start = 0;
        int end = 0;
        for (int j : arr) {
            start = Math.max(start, j);
            end += j;
        }
        return binarySumSearch(arr, m, start, end);
    }

    private static int binarySumSearch(int[] arr, int m, int start, int end) {
        while(start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int j : arr) {
                if (sum + j > mid) {
                    sum = j;
                    pieces++;
                } else {
                    sum += j;
                }
            }

            if(pieces <= m){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return end; //or you could return start
    }
}
