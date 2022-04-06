package strings;

import java.util.Arrays;

public class DefangIP {

    public static String defangIPaddr(String address) {

        char[] stringArray = new char[address.length()*3];
        int indexTwo =0;
        for (int index= 0; index<address.length(); index++) {
            if(address.charAt(index) == '.') {
                System.out.println(indexTwo);
                stringArray[indexTwo] = '[';
                stringArray[indexTwo+1] = '.';
                stringArray[indexTwo+2] = ']';
                indexTwo+=3;
            } else {
                stringArray[indexTwo] = address.charAt(index);
                indexTwo++;
            }
        }
        return new String(stringArray).trim();
    }

    public static void main(String[] args) {
        String a = "1.1.1.1";
        System.out.println(defangIPaddr(a));
    }
}
