package Functions;
import java.util.Scanner;

public class sumFirstNNatural {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the count of numbers :");
        n = in.nextInt();

        int sum = firstNNaturalNumbers(n);
        System.out.println("Sum :"+sum);
    }

    private static int firstNNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
}
