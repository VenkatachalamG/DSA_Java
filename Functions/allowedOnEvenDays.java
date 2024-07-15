package Functions;

public class allowedOnEvenDays {
    public static void main(String[] args) {
        int days = 31;
        int noOfDays = countOfDays(days);
        System.out.println("Number of ays he can go out :"+noOfDays);
    }

    private static int countOfDays(int days) {
        int count = 0;
        for (int i = 1; i <= days; i++) {
            if(i % 2 == 0){
                count++;
            }             
        }
        return count;
    }
}
