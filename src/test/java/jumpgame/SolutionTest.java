package jumpgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setup() {
        s = new Solution();
    }

    @Test
    public void canJump() {
        int[] in = new int[]{2,3,1,1,4};
        assertTrue(s.canJump(in));
    }

    @Test
    public void testCase2() {
        int[] in = new int[]{3,2,1,0,4};
        assertFalse(s.canJump(in));
    }

    @Test
    public void testWorstCase() {
        int[] in = new int[]{5, 4, 3, 2, 1, 0, 0};
        assertFalse(s.canJump(in));
    }

    @Test
    public void testCase3() {
        int[] in = new int[]{1, 5, 2, 1, 0, 2, 0};
        assertTrue(s.canJump(in));
    }

    @Test
    public void testCase4() {
        int[] in = new int[]{2, 4, 2, 1, 0, 2, 0};
        assertTrue(s.canJump(in));
    }
}