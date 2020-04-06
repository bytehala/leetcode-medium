package setZeroes;

public class Solution {

    public void setZeroes(int[][] matrix) {
        // y x

        int xLength = matrix[0].length;
        int yLength = matrix.length;
        boolean[] xFlags = new boolean[xLength];
        boolean[] yFlags = new boolean[yLength];

        for(int y = 0; y < yLength; y++) {
            for(int x = 0; x < xLength; x++) {
                if (matrix[y][x] == 0) {
                    xFlags[x] = true;
                    yFlags[y] = true;
                }
            }
        }

        for(int y = 0; y < yLength; y++) {
            for(int x = 0; x < xLength; x++) {
                if(yFlags[y] || xFlags[x]) {
                    matrix[y][x] = 0;
                }
            }
        }
    }
}
