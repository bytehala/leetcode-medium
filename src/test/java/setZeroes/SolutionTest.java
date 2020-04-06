package setZeroes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void setZeroes() {
        int[][] expected = {{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        Solution s = new Solution();
        int[][] input = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        s.setZeroes(input);
        assertArrayEquals(expected, input);
    }

}