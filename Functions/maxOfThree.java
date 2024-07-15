package Functions;
import java.util.Scanner;

public class maxOfThree {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int res = maximum(a,b,c);
        System.out.println(res);
    }

    static int maximum(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }

        if(b > a && b > c){
            return b;
        }

        return c;
    }
}
