package strings;

public class MaxNumberOfWords {

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String elem : sentences ){
            int result = wordCounter(elem);
            max = Math.max(max, result);
        }
        return max;
    }

    private static int wordCounter(String sentence) {
        int counter = 0;
        for(int i=0; i<sentence.length(); i++) {
            if(Character.isWhitespace(sentence.charAt(i))) {
                counter++;
            }
        }
        return counter+1;
    }

    public static void main(String[] args) {
        String[] b = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String a = "this is great thanks very much";
        System.out.println(mostWordsFound(b));
    }
}
