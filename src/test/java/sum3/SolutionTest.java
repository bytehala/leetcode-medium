package sum3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSum() {
        Solution solution = new Solution();
        int[] test = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> s = solution.threeSum(test);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(new Integer[]{-1, 0, 1}));
        expected.add(Arrays.asList(new Integer[]{-1, -1, 2}));
        System.out.println("s = " + s);
        assertEquals(expected, s);
    }
}