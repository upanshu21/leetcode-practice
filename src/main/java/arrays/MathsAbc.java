//package arrays;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//
//public class MathsAbc {
//
//    public static int  funcTwins(int[] inputArr)
//    {
//        Arrays.sort(inputArr);
//        //	int length = inputArr.length();
//
//        int result = -1;
//        int isEmpty = -1;
//        int isNotEmpty = 0;
//
//        if(inputArr.length == 1) {
//            isEmpty = inputArr[0];
//        }
//
//        //	HashMap<Integer, Interger> dict = new HashMap();
//
//
//        //take number of occurance as key and number as value
//
//        for(int index = 1; index< inputArr.length-1; index++){
//            if(inputArr[index-1] == inputArr[index] || inputArr[index] == inputArr[index+1]) {
//                result = -1;
//                System.out.println(result);
//            }
//            else{
//                isEmpty = inputArr[index];
//            }
//        }
//
//        return Math.max(isEmpty, result);
//
//
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {1,1,2,2};
//        System.out.println(funcTwins(arr));
//
//        System.out.println(88%10
//        );
//
//        List<Integer> a = new ArrayList<>();
//        a.
//    }
//}
