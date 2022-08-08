package arrays;

import java.util.Arrays;

class CyclicRotation {

    public static int[] rotate(int[] arr, int n) {
        int firstElement = arr[n - 1];
        for (int index = n - 1; index >= 1; index--) {
            arr[index] = arr[index - 1];
        }
        arr[0] = firstElement;
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4};
        System.out.println(Arrays.toString(rotate(a, 4)));
    }
}
