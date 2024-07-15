public class ceilCharacter {
    public static void main(String[] args) {
        char[] arr = {'c','e','f','j'};
        char target = 'g';
        char ans = orderAgnosticBinary(arr, target);
        System.out.println(ans);
    }

    private static char orderAgnosticBinary(char[] arr, char target) {
        int start = 0, end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return arr[mid + 1];
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
//        System.out.println(start);
        return arr[start];
    }
}
