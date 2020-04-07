package longestSubstring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void lengthOfLongestSubstring() {
        int actual = s.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, actual);
    }

    @Test
    public void testCase2() {
        int actual = s.lengthOfLongestSubstring("bbbbbbbb");
        assertEquals(1, actual);

    }

    @Test
    public void testCase3() {
        int actual = s.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, actual);
    }

    @Test
    public void testCase4() {
        int actual = s.lengthOfLongestSubstring(" ");
        assertEquals(1, actual);
    }

    @Test
    public void testCase5() {
        int actual = s.lengthOfLongestSubstring("dvdf");
        assertEquals(3, actual);
    }

    @Test
    public void testCase6() {
        int actual = s.lengthOfLongestSubstring("abba");
        assertEquals(2, actual);
    }
}