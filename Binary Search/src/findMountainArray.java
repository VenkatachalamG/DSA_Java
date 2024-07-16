public class findMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10, 12, 13, 11, 9, 5, 3, 1, 0};
        int target = 11;
        int ans = search(arr, target);
        System.out.println("Index :"+ans);
    }

    private static int search(int[] arr, int target) {
        int peak = peakElement(arr);
        int firstHalf = orderAgnosticBinary(arr, target, 0, peak);
        if (firstHalf != -1) {
            return firstHalf;
        }
        return orderAgnosticBinary(arr, target, peak + 1, arr.length - 1);
    }

    static int orderAgnosticBinary(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) { // Ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // Target not found
    }

    static int peakElement(int[] arr) {
        int start = 0, end = arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return 0; // return index of the only element
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid; // The peak is on the left side or mid
            } else {
                start = mid + 1; // The peak is on the right side
            }
        }
        return start; // start is the index of the peak element
    }
}
