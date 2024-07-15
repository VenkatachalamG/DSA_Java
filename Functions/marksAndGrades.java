package Functions;
import java.util.Scanner;

public class marksAndGrades {
    public static void main(String[] args) {
        int marks;
        // char grades;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks :");
        marks = in.nextInt();
        String finalGrade = Grade(marks);
        System.out.println("Your Grade :"+finalGrade);
    }

    private static String Grade(int marks) {
        if(marks >= 91 && marks<=100){
            return "AA";
        }
        if(marks >= 81 && marks<=90){
            return "AB";
        }
        if(marks >= 71 && marks<=80){
            return "BB";
        }
        if(marks >= 61 && marks<=70){
            return "BC";
        }
        if(marks >= 51 && marks<=60){
            return "CD";
        }
        if(marks >= 41 && marks<=50){
            return "DD";
        }
        return "fail";
    }
}
