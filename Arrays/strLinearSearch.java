package Arrays;

import java.util.Scanner;

public class strLinearSearch {
    public static void main(String[] args) {
        String message;
        System.out.println("Enter the string :");
        Scanner in = new Scanner(System.in);
        message = in.nextLine();
        char target;
        System.out.println("Enter the char to search :");
        target = in.next().charAt(0);

        int ans = stringSearch(message, target);
        System.out.println(ans);
    }

    private static int stringSearch(String message, char target) {
        if (message.length() == 0){
            return -1;
        }

        for (int i = 0; i < message.length(); i++) {
            if (target == message.charAt(i)){
                return i;
            }
        }
//        for (char ch : message.toCharArray()){
//            if (ch == target){
//                return ;
//            }
//        }
        return -1;
    }
}
