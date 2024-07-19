package OneDArray;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {54,47,35,31,28,25,20,17,12,8};
        int target = 12;
        int ans = orderAgnosticBinary(arr, target);
        System.out.println(ans);
    }

    private static int orderAgnosticBinary(int[] arr, int target) {
        int start = 0, end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if(arr[start] < arr[end]){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
