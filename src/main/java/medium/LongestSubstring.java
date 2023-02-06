package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> dict = new HashMap<>();

        int start = 0;
        int longest = 0;

        for(int end = 0; end<s.length(); end++) {
            char letter = s.charAt(end);
            // if the map does contain the letter
            System.out.println("index" + end);
            if(dict.containsKey(letter)) {
                start = Math.max(start, dict.get(letter));
            }

            dict.put(letter, end+1);
            //a 1
            //b 2
            //c 3
            int subStringLength = end - start +1;
            // 1
            // 2
            // 3
            longest = Math.max(longest, subStringLength);
            // 1
            // 2
            // 3
        }
        return longest;
    }

    public static int longestSubstringWithSecondApproach(String s) {

        return 1;
    }


    public static void main(String[] args) {
        String s = "aul";
        String s1 = "abcabcaa";
        String S3 = " ";
     //   System.out.println(s.length());
        System.out.println(lengthOfLongestSubstring(s1));
    }
}
