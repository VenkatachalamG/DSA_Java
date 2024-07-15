package Functions;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the total number of terms in the series :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        fiboSeries(n);
    }

    private static void fiboSeries(int n) {
        if( n == 1){
            System.out.println(0);
        }

        else if(n == 2){
            System.out.print(0+" "+ 1);
        }
        else{
            int a = 0, b = 1;
            for (int i = 0; i <= n; i++){
                int c = a + b;
                System.out.print(" "+c);
                a = b;
                b = c;
            }
        }
    }
}
