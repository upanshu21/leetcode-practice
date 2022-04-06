package arrays;


import java.util.Objects;

public class OneDArray {

    public static int[] runningSum(int[] nums) {
        int tracker = 0;
        int[] resultArray = new int[nums.length];

        for(int pointer = 0; pointer < nums.length; pointer++) {
            resultArray[pointer] = nums[pointer] + tracker;
            tracker = resultArray[pointer];
        }
        return resultArray;
    }

    public static int finalValueAfterOperations(String[] operations) {
        int variable= 0;
        for(int pointer= 0; pointer < operations.length; pointer++) {
            if(Objects.equals(operations[pointer], "++X") || Objects.equals(operations[pointer], "X++")) {
                variable++;
            } else {
                variable--;
            }
        }
        return variable;
    }

    public static void main(String[] args) {
        String[] a = {"--X","X++","X++"};
    }
}
