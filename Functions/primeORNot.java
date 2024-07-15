package Functions;
import java.util.Scanner;

public class primeORNot {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = in.nextInt();

        boolean prime = primeOrNot(num);
        System.out.println(prime);
    }

    private static boolean primeOrNot(int num) {
        int i;
        for (i = 2; i * i <= num ; i++) {
            if(num % i ==  0){
                return false;
            }
        }
        return i * i > num;
    }
}
