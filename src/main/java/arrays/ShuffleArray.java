package arrays;

import java.util.Arrays;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] resulArray = new int[nums.length];
        int index = 0;
        for(int elem =0; elem < nums.length; elem++ ) {
            resulArray[elem] = nums[index];
            resulArray[elem+1] = nums[index+n];
            System.out.println(elem);
            elem++;
            index++;
        }
        return resulArray;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(a, 4)));
    }
}
