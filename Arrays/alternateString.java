package Arrays;



public class alternateString {
    public static void main(String[] args) {
        String str = "abcd", str2 = "pq";
        String result = mergeAlternately(str, str2);
        System.out.println("Merged String :"+result);
    }

    static String mergeAlternately(String str, String str2) {
        StringBuilder result = new StringBuilder();
        int len1 = str.length(), len2 = str2.length(), i= 0;
        while ( i < len1 && i < len2){
            result.append(str.charAt(i));
            result.append(str2.charAt(i));
            i++;
        }

        if (i < len1) {
            result.append(str.substring(i));
        }

        if (i < len2) {
            result.append(str2.substring(i));
        }
        return result.toString();
    }
}
