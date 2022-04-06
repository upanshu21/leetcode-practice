package arrays;

import java.util.Arrays;

class Solution {

    public static int[] getConcatenation(int[] nums) {
        int[] resultArray = new int[nums.length * 2];
        int pointer = nums.length;
        int secondPointer = 0;

        for(int counter = 0; counter <= resultArray.length-1; counter++) {

            if(counter <= nums.length-1) {
                resultArray[counter] = nums[counter];
                System.out.println(counter);
            }
            else {
                resultArray[pointer] = nums[secondPointer];
                secondPointer++;
                pointer++;

            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] a = {3,2,1,4};
        System.out.println(Arrays.toString(getConcatenation(a)));
    }
}
