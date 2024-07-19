package OneDArray;

public class peakElementIndex {
    public static void main(String[] args) {
        int[] arr = {-3, -1, 0 ,4, 6, 8, 9, 4, 3, 1,0};
        int index = peakElement(arr);
        System.out.println("Peak element :"+index);
    }

    private static int peakElement(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
