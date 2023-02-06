package random;

public class Palindrome {

    public static boolean isPalindrome(int number) {

        if(number < 0) {
            return false;
        }
        int tracker = number;
        int reverse = 0;

        while(tracker != 0) {
            reverse = tracker%10 + (reverse*10);
            tracker /= 10;
        }
        return reverse == number;
    }

    public static void main(String[] args) {
        int n = 1229;
        System.out.println(isPalindrome(n));
    }
}
