package dcp._4_lowestMissing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int getLowestMissing(int[] arr) {
        Set<Integer> s = new HashSet<>();
        int max = 0;
        for(int i : arr) {
            s.add(i);
            if(i > max) {
                max = i;
            }
        }

        int lowest = 1;
        for(int i = lowest; i <= max; i++) {
            if(s.contains(i)) {
                lowest++;
            } else {
                break;
            }
        }
        return lowest;
    }
}
