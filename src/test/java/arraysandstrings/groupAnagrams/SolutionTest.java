package arraysandstrings.groupAnagrams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void groupAnagrams() {
        List<List<String>> actual = s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList(new String[]{"ate","eat","tea"}));
        expected.add(Arrays.asList(new String[]{"nat","tan"}));
        expected.add(Arrays.asList(new String[]{"bat"}));

        assertEquals(expected, actual);
    }
}