package strings;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char element : chars) {
            System.out.println(element);
            if (element == '(' || element == '[' || element == '{') {
                stack.push(element);
             //   System.out.println("pushed" + element);
                continue;
            } else if (stack.empty()) {
                return false;
            }
          //  System.out.println(stack);
            char top = stack.pop();
           // System.out.println(top);
            if (top == '(' && element != ')') {
                System.out.println(top+ element);
                return false;
            } else if (top == '[' && element != ']') {
                return false;
            } else if (top == '{' && element != '}') {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {

        String a = "()(){}";
        System.out.println(isValid(a));

    }
}
