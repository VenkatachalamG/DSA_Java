public class simpleBSearch {
    public static void main(String[] args) {
        int[] arr = {12,13,7,4,3,2,1,2};
        int target = 13;
        int indexOfBinary = binarySearchMethod(arr, target);
        System.out.println("Element present at position "+indexOfBinary);
    }

    private static int binarySearchMethod(int[] arr, int target) {
        int start = 0, end = arr.length -1;

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
