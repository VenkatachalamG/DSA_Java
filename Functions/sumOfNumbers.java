package Functions;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the count of numbers:");
        n = in.nextInt();
        int[] list = new int[n];
        System.out.println("Enter the numbers :");
        for (int i = 0; i < list.length; i++) {
          list[i] = in.nextInt();  
        }

        sumOfNNumbers(list);
    }

    private static void sumOfNNumbers(int[] list) {
        int posEvenSum = 0, negSum = 0, posOddSum = 0;

        for (int i = 0; i < list.length; i++) {
            if(list[i] == 0){
                break;
            }

            if(list[i] < 0){
                negSum += list[i];
            }

            else if(list[i] % 2 ==0){
                posEvenSum += list[i];
            }
            else{
                posOddSum += list[i];
            }
        }

        System.out.println("Negative number sum :"+ negSum);

        System.out.println("Positive Even number sum :"+ posEvenSum);

        System.out.println("Positive Odd number sum :"+ posOddSum);
    }
}
