package algonutshell.dynamic.geneEdit;

public class Solution {

    int minEditDistance(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        int[][] m = new int[len1 + 1][len2 + 1];

        for(int i = 1; i < len1 + 1; i++) {
            m[i][0] = i;
        }
        for(int j = 1; j < len2 + 1; j++) {
            m[0][j] = j;
        }

        for(int i = 1; i < len1 + 1; i++) {
            for (int j = 1; j < len2 + 1; j++) {
                int cost = 1;
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    cost = 0;

                int replaceCost = m[i-1][j-1] + cost;
                int removeCost = m[i-1][j] + 1;
                int insertCost = m[i][j-1] + 1;
                m[i][j] = Math.min(Math.min(replaceCost, removeCost), insertCost);
            }
        }

        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                System.out.print(" " + m[i][j]);
            }
            System.out.println();
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.minEditDistance("GCTAC", "CTCA");
    }
}
