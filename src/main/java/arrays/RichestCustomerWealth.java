package arrays;

import java.util.Arrays;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int counter= 0;
        for (int[] account : accounts) {
            int tracker = 0;
            for(int eachElement: account) {
                tracker = tracker + eachElement;
            }
            counter = Math.max(counter,tracker);
        }
        return counter;
    }

    public static void main(String[] args) {
        int[][] a = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(a));
    }
}
