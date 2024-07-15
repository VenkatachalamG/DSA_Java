package Functions;
import java.util.Scanner;

public class areaAndCircumference {
    static float pi = 22 / 7;
    public static void main(String[] args) {
        int radius;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius :");
        radius = in.nextInt();
        float area = findArea(radius);
        float circumference = findCircumference(radius);
        System.out.println("Area :"+area);
        System.out.println("Circumference :"+circumference);
    }

    static float findCircumference(int r) {
        return pi * r * r;

    }

    private static float findArea(int r) {
       return 2 * pi * r;
    }
}
