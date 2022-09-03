package arrays;

public class GoodPairs {

    public static int numIdenticalPairs(int[] nums) {

        int result = 0;
        for(int index = 0; index < nums.length; index++) {
            for(int pointer = index+1; pointer < nums.length; pointer++) {
                if(nums[index] == nums[pointer] && index< pointer ) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}


/*
https://leetcode.com/problems/number-of-good-pairs/
 */




