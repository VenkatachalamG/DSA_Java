package Arrays;

import java.util.*;

public class typeRuleMatch {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        System.out.println("Enter the number of elements :");
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.nextLine();
        System.out.println("Enter the type color and name");
        for (int i = 0; i < n; i++) {
            String input = in.nextLine();
            list.add(Arrays.asList(input.split(" ")));
        }
        String ruleValue, ruleKey;
        System.out.println("Enter the ruleKey and ruleValue :");
        ruleKey = in.next();
        ruleValue = in.next();
        int rulesMatched = arrayMatch(list, ruleKey, ruleValue);
        System.out.println("Rules Matched :"+rulesMatched);
}

    private static int arrayMatch(List<List<String>> list, String ruleKey, String ruleValue) {
        int count = 0, index = 0;
        switch(ruleKey){
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
            default :
                System.out.println("Invalid ruleKey");    
        }
        for (List<String> row : list){

            if(row.get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
    }
