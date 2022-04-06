package arrays;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        boolean[] result = new boolean[candies.length];
        List<Boolean> list = new ArrayList<>();
        for(int index = 0; index < candies.length; index++) {
            for (int candy : candies) {
                if (candies[index] + extraCandies >= candy) {
                    result[index] = true;
                } else {
                    result[index] = false;
                    break;
                }
            }
        }
        for(Boolean array: result) {
            list.add(array);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {2,3,5,1,3};
        System.out.println(kidsWithCandies(array,3));
    }
}

/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
