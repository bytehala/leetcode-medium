package dcp.productOfAll;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {


    @Test
    public void oneToFive() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{120, 60, 40, 30, 24};
        assertArrayEquals(expected, Solution.productOfAllInArray(input));
    }

    @Test
    public void threeToOne() {
        int[] input = new int[]{3, 2, 1};
        int[] expected = new int[]{2, 3, 6};
        assertArrayEquals(expected, Solution.productOfAllInArray(input));
    }

    @Test
    public void empty() {
        int[] input = new int[]{};
        int[] expected = new int[]{};
        assertArrayEquals(expected, Solution.productOfAllInArray(input));
    }

}