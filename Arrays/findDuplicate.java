package Arrays;


public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = cyclicSortingDuplicate(arr);
        System.out.println(ans);
    }

    private static int cyclicSortingDuplicate(int[] arr) {
        int i = 0;

        while (i < arr.length){
            if (arr[i] != i + 1){
                int element = arr[i] - 1;
                if (arr[i] != arr[element]) {
                    swap(arr, i, element);
                }
                else {
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}