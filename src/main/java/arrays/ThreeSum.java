package arrays;

import java.util.*;

//https://leetcode.com/problems/3sum/submissions/892324923/
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        if( nums.length == 0) return new ArrayList<>();

        Set<List<Integer>> set = new HashSet<>();
        // -1 -1 0 1 2 3 4
        Arrays.sort(nums);
        int sum = 0;
        for(int index = 0; index< nums.length-1; index++) {

            int lastIndexPos = nums.length - 1;
            int innerIndex = index + 1;

            while (innerIndex < lastIndexPos) {

                sum = nums[index] + nums[innerIndex] + nums[lastIndexPos];
                if (sum == 0) {
                    set.add(
                        Arrays.asList(nums[index], nums[innerIndex], nums[lastIndexPos]));
                    innerIndex++;
                    lastIndexPos--;
                }
                if (sum < 0) innerIndex++;
                if (sum > 0) lastIndexPos--;
            }
        }

            return new ArrayList<>(set);
        }

    public static void main(String[] args) {

        int[] demo = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(demo));
    }
}
