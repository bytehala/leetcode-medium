package longestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        char[] letters = s.toCharArray();
        Map<Character, Integer> chars = new HashMap<>();
        int longest = 0;
        int streak = 0;

        for(int right = 0, left = 0; right < letters.length; right++) {

            if(chars.containsKey(letters[right])) {
                left = Math.max(chars.get(letters[right]), left);
            }

            longest = Math.max(longest, right - left + 1);
            chars.put(letters[right], right+1);

        }

        return longest;
    }

}
