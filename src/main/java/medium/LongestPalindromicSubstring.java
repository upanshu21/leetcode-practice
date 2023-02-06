package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if(s.length() == 0) {
            return s;
        }

        String longestString = "";
        String current;

        for(int index = 0; index < s.length(); index++) {
            current = isPalindromic(index, index, s);
            if(current.length() > longestString.length()) {
                longestString = current;
            }

            current = isPalindromic(index, index+1, s);
            if(current.length() > longestString.length()) {
                longestString = current;
            }
        }
        return longestString;
     }

    public static String isPalindromic(int left, int right, String s) {

        //for odd length
        // we will pick a letter in the middle and expand on both the direction as long as both the pointers are equal
        // to find the palindrome substring.
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            right++;
            left--;
        }
        return s.substring(left+1,right);
    }

    public static void main(String[] args) {

        String s = "babaddddbaabaabaab";
       // System.out.println(s.substring(8,14+1));
        String a = "bab";
        System.out.print(longestPalindrome(s));

    }
}
