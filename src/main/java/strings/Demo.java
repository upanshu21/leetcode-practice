package strings;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

    public static Integer fucn(long a, long b) {

        String num1 = String.valueOf(a);
        String num2 = String.valueOf(b);
        Long result = 0L;
        Character[] charArray = num1.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        if(num1.length() != num2.length()) {
            result = -1L;
        } else {
            result = Long.reverse(a);
        }

      //  String result = Arrays.toString(charArray);
        return Math.toIntExact(result);
    }

    public static void main(String[] args) {

        System.out.println(fucn(123, 456));
    }

}
