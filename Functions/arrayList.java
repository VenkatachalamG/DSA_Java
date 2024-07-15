package Functions;

import java.util.ArrayList;



public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(56);
        arr.add(5);
        arr.add(6);
        arr.add(70);
        arr.add(23);

//        System.out.println(arr);
//
//        System.out.println(arr.get(4));
//        System.out.println(arr.contains(134));

        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));
        }
    }
}
