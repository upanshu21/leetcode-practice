package arrays;

import java.util.Arrays;

public class MissingNumber {

    static int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int sum = 0;
        int sumTotal = (n*(n+1))/2;

        for(int index = 0; index < n-1 ; index ++) {
            sum += array[index];
        }
        return sumTotal - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(MissingNumber(arr, 5));
    }
}
