package OneDArray;

public class floorOfElement {
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,13,16,18,23,25};
        int target = 9;
        int ans = orderAgnosticBinary(arr, target);
        System.out.println(ans);
    }

    private static int orderAgnosticBinary(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
//            if(arr[start] < arr[end]){
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
//            }

//            else {
//                if (target > arr[mid]){
//                    end = mid - 1;
//                }
//                else if (target < arr[mid]){
//                    start = mid + 1;
//                }
//            }
        }
//        System.out.println(end);
        return arr[end];
    }
}
