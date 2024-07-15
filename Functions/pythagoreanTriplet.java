package Functions;
import java.util.Scanner;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the triplet of numbers :");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        boolean PythagoreanTriplet = ispythagoreanTriplet(a,b,c);
        System.out.println(PythagoreanTriplet);
    }

    private static boolean ispythagoreanTriplet(int a, int b, int c) {
        return (a * a + b * b == c * c);
    }
}
