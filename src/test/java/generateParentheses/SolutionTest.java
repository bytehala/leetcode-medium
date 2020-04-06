package generateParentheses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void generateParenthesis() {
        Solution s = new Solution();
        List<String> actual = s.generateParenthesis(3);
        List<String> expected = new ArrayList<String>(
                Arrays.asList(new String[]{
                        "((()))",
                        "(()())",
                        "(())()",
                        "()(())",
                        "()()()"
                }));
        assertEquals(expected, actual);
    }
}