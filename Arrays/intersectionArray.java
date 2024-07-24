package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] ans = arrayIntersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
        arrayIntersection(nums1, nums2);
    }

    private static int[] arrayIntersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] fr1 = new boolean[1001], fr2 = new boolean[1001];
        for (int num :  nums1){
            if (!fr1[num]){
                fr1[num] = true;
            }
        }

        for (int num : nums2){
            if (!fr2[num]){
                fr2[num] = true;
            }
        }
        for (int k = 0; k < 1001; k++) {
            if (fr1[k] && fr2[k]){
                ans.add(k);
            }
        }
        int[] res = ans.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }

}
