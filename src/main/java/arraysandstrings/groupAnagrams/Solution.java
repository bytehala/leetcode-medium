package arraysandstrings.groupAnagrams;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            List<String> value = map.get(key);
            if (value == null) {
                value = new ArrayList<>();
                value.add(s);
                map.put(key, value);
            } else {
                value.add(s);
            }
        }
        return new ArrayList(map.values());
    }
}
