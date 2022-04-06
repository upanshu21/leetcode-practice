package strings;

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {

        char[] resultArray = new char[indices.length];
        for(int index= 0; index< indices.length; index++) {
            resultArray[indices[index]] = s.charAt(index);
        }
        return new String(resultArray);
    }

    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        System.out.println(restoreString(s,a));
    }
}
