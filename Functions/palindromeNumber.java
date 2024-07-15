package Functions;
import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number :");
        num = in.nextInt();
        boolean isPalindrome = palindrome(num);
        System.out.println(isPalindrome);
    }

    private static boolean palindrome(int num) {
        int copy = num;
        int sum = 0,rem;
        while(copy > 0){
            rem = copy % 10;
            sum = sum * 10 + rem;
            copy = copy / 10;
        }
        return sum == num;
    }
}
