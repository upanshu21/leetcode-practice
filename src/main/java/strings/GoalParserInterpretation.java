package strings;

public class GoalParserInterpretation {

    public static String interpret(String command) {

        char[] resultArray = new char[command.length()+10];
        int pointer = 0;
        for(int index = 0; index < command.length(); index++) {
            if(command.charAt(index) == 'G') {
                resultArray[pointer] = 'G';
                pointer++;
            }
            if(command.charAt(index) == '(' && command.charAt(index+1) == ')') {
                resultArray[pointer] = 'o';
                pointer++;
            }
            if(command.charAt(index) == '(' && command.charAt(index+1) == 'a') {
                resultArray[pointer] = 'a';
                resultArray[pointer+1] = 'l';
                pointer+=2;
                }
        }
        return new String(resultArray).trim();
    }

    public static void main(String[] args) {
        String string = "G()(al)";
        System.out.println(interpret(string));
    }
}
