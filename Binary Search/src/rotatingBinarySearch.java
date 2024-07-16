public class rotatingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 1;

        int ans = searchInArr(arr, target);
        System.out.println(ans);
    }

    private static int searchInArr(int[] arr, int target) {
        int pivot = findPivot(arr);
//        System.out.println(pivot);
        if (pivot == -1) {
            return binarySearchMethod(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] <= target) {
            return binarySearchMethod(arr, target, 0, pivot - 1);
        } else {
            return binarySearchMethod(arr, target, pivot + 1, arr.length - 1);
        }
    }

    private static int findPivot(int[] arr) {
        int start = 0,end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if ( mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if (mid > start && arr[mid -1] < arr[mid]){
                return mid - 1;
            }

            else if (start >= arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearchMethod(int[] arr, int target, int start, int end) {

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] < target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
