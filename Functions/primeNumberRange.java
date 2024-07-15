package Functions;
import java.util.Arrays;
import java.util.Scanner;

public class primeNumberRange {
    public static void main(String[] args) {
        int start, end;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the start and end ranges :");
        start = in.nextInt();
        end = in.nextInt();

        int[] primeNumbers = primeNumberArray(start, end);
        System.out.println(Arrays.toString(primeNumbers));
    }

    private static int[] primeNumberArray(int start, int end) {
        int[] ans = new int[(end-start)]; int c =0;
        for (int i = start; i <= end; i++) {
            boolean primeNum = isPrime(i);
            if(primeNum){
                ans[c] = i;
                c++;
            }
        }
        return ans;
    }

    private static boolean isPrime(int num) {
        int i;
        for (i = 2; i * i <= num ; i++) {
            if(num % i ==  0){
                return false;
            }
        }
        return i * i > num;
    }
}
