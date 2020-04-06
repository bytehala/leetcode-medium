package letterCombinations;

import java.util.*;

public class Solution {

    static Map<String, String[]> mapping = new HashMap<>();
    static {
        mapping.put("2", new String[]{"a", "b", "c"});
        mapping.put("3", new String[]{"d", "e", "f"});
        mapping.put("4", new String[]{"g", "h", "i"});
        mapping.put("5", new String[]{"j", "k", "l"});
        mapping.put("6", new String[]{"m", "n", "o"});
        mapping.put("7", new String[]{"p", "q", "r", "s"});
        mapping.put("8", new String[]{"t", "u", "v"});
        mapping.put("9", new String[]{"w", "x", "y", "z"});
    }

    List<String> output = new ArrayList<String>();

    public void backtrack(String combination, String next_digits) {
        if(next_digits.length() == 0) {
            output.add(combination);
            return;
        }

        String digit = next_digits.substring(0, 1);
        next_digits = next_digits.substring(1);

        String[] letters = mapping.get(digit);
        for(String letter : letters) {
            backtrack(combination + letter, next_digits);
        }

    }


    public List<String> letterCombinations(String digits) {
        backtrack("", digits);
        return output;
    }

}
