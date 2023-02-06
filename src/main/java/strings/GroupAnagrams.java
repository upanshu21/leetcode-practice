package strings;

import java.util.Arrays;

public class GroupAnagrams {

    public static int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

// [0,3,5,6,7,8,9,12,13,14,15,16]
        int count = 0;
        int longest = 0;
        for(int index = 1; index< nums.length; index++) {
            if(nums[index] - nums[index-1] == 1) {
                count++;
             //   System.out.println(count);
             //   System.out.println(index+ "index");
            } else {
                longest = count+1;
                System.out.println(longest);
                count = 0;
            }

        }
        return Math.max(longest, count);
    }

    public static void main(String[] args) {

        int[] a = {0,1,2,3,5,7,8,9};
      //  String a = new String("fgfdfvd");
        System.out.println(longestConsecutive(a));
    }
}
