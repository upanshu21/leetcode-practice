package strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesesChecker {

    static boolean isPar(String x)
    {
        // add your code here
        Deque<Character> stack = new ArrayDeque<>();
        for(int index=0; index< x.length(); index++) {
            char elem = x.charAt(index);
            if(elem == '(' || elem == '{' || elem == '[') {
                stack.
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPar("{}(){}[]"));
    }
}
