package Functions;
import java.util.Scanner;

public class voteEligible {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age: \n");
        age = in.nextInt();
        boolean eligible = eligibleToVote(age);
        System.out.println(eligible);
    }

    private static boolean eligibleToVote(int age) {
        if(age >= 18){
            return true;
        }
        return false;
    }
}
