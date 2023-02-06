package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        int length = strs.length;

        String left = strs[0];
        String right = strs[length-1];

        int pointer = 0;

        while(pointer < left.length()) {
            if(left.charAt(pointer) == right.charAt(pointer)) {
                pointer++;
            } else {
                break;
            }
        }
        return pointer == 0 ? "" : left.substring(0,pointer);
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        Arrays.sort(strs);
        String s = "asdasdasd";

        System.out.println(longestCommonPrefix(strs));
    }
}
