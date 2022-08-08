package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class DuplicateElements {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int element = arr[0];
        int frequency = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int index = 0; index < n; index++) {
            System.out.println(arr[index]+ "  "+ element);

            if(arr[index] == element) {
             //   System.out.println(true );
                frequency++;
            } else {
                frequency = 1;
            }
            if(frequency == 2) {
                result.add(arr[index]);
            }
            element = arr[index];
            System.out.println(frequency);
        }
        if(result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,5,5,5,5,5,5};
        System.out.println(duplicates(arr,13));
    }
}
