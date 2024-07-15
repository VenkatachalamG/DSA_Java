package Functions;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number :");
        num = in.nextInt();
        int fact = Factorial(num);
        System.out.println(fact);
    }

    private static int Factorial(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }
}
