package letterCombinations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void letterCombinations() {
        Solution s = new Solution();
        List<String> expected = new ArrayList<>(Arrays.asList(
                new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}));
        assertEquals(expected, s.letterCombinations("23"));
    }

    @Test
    public void number2() {
        Solution s = new Solution();
        List<String> expected = new ArrayList<>(Arrays.asList(
                new String[]{"a", "b", "c"}));
        assertEquals(expected, s.letterCombinations("2"));
    }
}