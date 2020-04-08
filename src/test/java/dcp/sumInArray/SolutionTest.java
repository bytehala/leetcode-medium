package dcp.sumInArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canFindSum() {
        int[] arr = new int[]{10, 15, 3, 7};
        assertTrue(Solution.canFindSum(arr, 17));
    }

    @Test
    public void cantFindSum() {
        int[] arr = new int[]{10, 15, 3, 7};
        assertFalse(Solution.canFindSum(arr, 16));
    }

    @Test
    public void canFindSum2() {
        int[] arr = new int[]{10, 10};
        assertTrue(Solution.canFindSum(arr, 20));
    }
}