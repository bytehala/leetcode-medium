package dcp.sumInArray;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static boolean canFindSum(int[] nums, int sum) {

        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            int addend = sum - i;
            if (set.contains(addend)) {
                return true;
            }
            if(!set.contains(i)) {
                set.add(i);
            }
        }

        return false;
    }

}
