package sum3;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i < nums.length - 2; i++) {
            int value = nums[i];
            int startIndex = i+1;
            int endIndex = nums.length -1;

            while(startIndex < endIndex) {

                int sum = value + nums[startIndex] + nums[endIndex];
                if(sum == 0) {
                    result.add(Arrays.asList(new Integer[]{value, nums[startIndex], nums[endIndex]}));
                    startIndex++;
                    endIndex--;
                } else if (sum > 0) {
                    endIndex--;
                } else {
                    startIndex++;
                }
            }


        }


        return new ArrayList(result);
    }

}
