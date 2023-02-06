package strings;

import java.util.Arrays;

public class Reverse {

    public static String reverseString(char[] s) {
        int index = 0;
        int length = s.length-1;

        while( index < length) {

            char temp = s[index];
            s[index] = s[length];
            s[length] = temp;
            index++;
            length--;

        }
        return Arrays.toString(s);
    }

    public static void main(String[] args) {

        char[] a = {'h','e','l','l','o'};
        System.out.println(reverseString(a));
    }
}
