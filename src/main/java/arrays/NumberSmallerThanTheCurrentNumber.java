package arrays;

import java.util.Arrays;

public class NumberSmallerThanTheCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] resultArray = new int[nums.length];
        int counter= 0;
        for(int index = 0; index< nums.length; index++) {
            for (int num : nums) {
                if (nums[index] > num) {
                    counter++;
                }
            }
            resultArray[index] = counter;
            counter=0;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}

/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
