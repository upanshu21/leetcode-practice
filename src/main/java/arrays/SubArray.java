package arrays;

import java.util.ArrayList;

public class SubArray {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) {

        int start = 0;
        int currentSum = arr[0];
        ArrayList<Integer> result = new ArrayList<>();
        // Your code here

        for(int index = 1; index <= n; index++ ) {
            System.out.println(currentSum + "   " + index);

            while (currentSum > sum && start < index -1) {
                currentSum = currentSum - arr[start];
                start++;
            }
            if(currentSum == sum) {
                result.add(start+1);
                result.add(index);
                break;
            }

            if(index < n) {
                currentSum = currentSum + arr[index];
            }

            if(index == n && result.isEmpty()) {
                result.add(-1);
            }

        }
       return result;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(subarraySum(array,10, 15));

//        int[] array = {1, 2, 3, 7, 5};
//        System.out.println(subarraySum(array,5, 12));
    }
}
