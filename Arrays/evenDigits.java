package Arrays;

public class evenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int count = howManyEvenDigits(arr);
        System.out.println("Count of numbers having even digits :"+ count);
    }

    private static int howManyEvenDigits(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // This method is by taking the integer and converting to string to directly then find the length
//             String digits = new String(String.valueOf(arr[i]));
//             if (digits.length() % 2 == 0){
//                 count++;
//             }
            int numberOfDig = digExt(arr[i]);
            if (numberOfDig % 2 == 0){
                count++;
            }
        }
        return count;
    }

    private static int digExt(int ele) {
        int i = 0, count = 0;
        while(ele > 0){
            int dig = ele % 10;
            ele = ele/ 10;
            count++;
        }
        return count;
    }
}
