package Arrays;

public class greatestStrDivisor {
    public static void main(String[] args) {
        String str1 = "LEETLEETCODE";
        String str2 = "LEET";
        int index = 0, count = 0;
        while((index = str1.indexOf(str2, index)) != -1){
            count++;
        }

        System.out.println(count);
    }
}
