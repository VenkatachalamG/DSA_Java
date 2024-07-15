package Functions;

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string :");
        str = in.nextLine();
        String reversedString = revStr(str);
        System.out.println("Reversed String :"+ reversedString);
    }

    private static String revStr(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
