package strings;

public class StringMemory {

    static String a = "hello";
    static String b = "hello";
    static String c = new String("hello");

    static Integer number = 10;
    static Integer numberTwo = 10;
    static Integer numberThree = new Integer(10);


    public static void main(String[] args) {
        System.out.println(a == c);
        System.out.println(a.equals(c));

        System.out.println(numberTwo == numberThree);
        System.out.println(number == numberTwo);
    }
}
