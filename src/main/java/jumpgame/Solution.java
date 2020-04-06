package jumpgame;

public class Solution {

    enum Index {
        GOOD, BAD, UNKNOWN;
    }

    Index[] memo;

//    public boolean canJumpFromPosition(int position, int[] nums) {
//        if(memo[position] != Index.UNKNOWN) {
//            return memo[position] == Index.GOOD;
//        }
//
//        int furthestJump = Math.min(position + nums[position], nums.length - 1);
//        for (int nextPosition = furthestJump; nextPosition > position; nextPosition--) {
//            if (canJumpFromPosition(nextPosition, nums)) {
//                memo[nextPosition] = Index.GOOD;
//                return true;
//            }
//        }
//
//        memo[position] = Index.BAD;
//        return false;
//    }

    public boolean canJump(int[] nums) {
        memo = new Index[nums.length];
        for(int i = 0; i < memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;

        for(int position = nums.length -2 ; position >= 0; position--) {
            int furthestJump = Math.min(position + nums[position], nums.length - 1);
            for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
                if (memo[nextPosition] == Index.GOOD) {
                    memo[position] = Index.GOOD;
                    break;
                }
            }
        }

        return memo[0] == Index.GOOD;
    }

}
