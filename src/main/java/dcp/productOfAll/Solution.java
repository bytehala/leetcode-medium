package dcp.productOfAll;

public class Solution {

    public static int[] productOfAllInArray(int[] arr) {
        int[] newArr = new int[arr.length];

        int product = 1;
        for(int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = product / arr[i];
        }
        return newArr;
    }

}
