package Functions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangramSentence {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter the string :");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        boolean res = isPangramSentence(str);
        System.out.println(res);

    }

    static boolean isPangramSentence(String str) {
        Set<Character> alphabet = new HashSet<>();
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            alphabet.add(str.charAt(i));
        }

        return alphabet.size() == 26;
    }
}
