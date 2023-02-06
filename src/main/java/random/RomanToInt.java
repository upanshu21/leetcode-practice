package random;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s) {
        Map<Character, Integer>  dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);


        int length = s.length();
        int result = 0;
        int previousValue = 0;
        for(int index = length-1; index>=0; index-- ) {
            char charElem = s.charAt(index);
            int value = dict.get(charElem);
            if(value < previousValue) {
                result = result - value;
            } else {
                result = result + value;
                previousValue = value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
