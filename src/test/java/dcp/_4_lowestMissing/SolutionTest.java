package dcp._4_lowestMissing;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getLowestMissing() {
        int[] in = {3, 4, -1, 1};
        assertEquals(2, Solution.getLowestMissing(in));
    }

    @Test
    public void getThree() {
        int[] in = {1, 2, 0};
        assertEquals(3, Solution.getLowestMissing(in));
    }

    @Test
    public void getOne() {
        int[] in = {-1, 0};
        assertEquals(1, Solution.getLowestMissing(in));
    }

    @Test
    public void getFour() {
        int[] in = {0, 1, 2, 3};
        assertEquals(4, Solution.getLowestMissing(in));
    }
}