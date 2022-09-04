package arrays;

import java.util.Arrays;

public class ArrayPermutation {



    public static int[] buildArray(int[] nums) {
        int[] numsResult = new int[nums.length];
        for(int pointer = 0; pointer < nums.length; pointer++ ) {
            numsResult[pointer] = nums[nums[pointer]];
        }
        return numsResult;

    }


    public static void main(String[] args) {
        int[] a = {0,2,1,5,3,4};
        System.out.println(buildArray(a));
    }
}
