package strings;

import java.util.Objects;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {


        String afterTransformation = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int right = 0;
        int left = afterTransformation.length()-1;

        while(right < left) {

           if(afterTransformation.charAt(right) != afterTransformation.charAt(left)) {
               return false;
           };
            right++;
            left--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));

    }
}
