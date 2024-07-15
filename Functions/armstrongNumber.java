package Functions;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = in.nextInt();

        boolean isArmstrong = checkArmstrongNumber(n);
        System.out.println(isArmstrong);
    }

    static boolean checkArmstrongNumber(int n) {
        if(n == 0){
            return true;
        }
        int rem, sum = 0, copy = n;
        while(n > 0){
            rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }
        if(sum == copy){
            return true;
        }
        return false;
    }
}
