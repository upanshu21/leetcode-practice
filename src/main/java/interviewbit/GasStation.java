package interviewbit;

public class GasStation {

    public static int canCompleteCircuit(int[] A, int[] B) {
        int totalGas = 0;
        int position = 0;

        for(int index = 0; index < A.length; index++) {
            totalGas += A[index] - B[index];
            if(totalGas < 0) {
                totalGas = 0;
                position = index+1;
            }
        }
        return position;

    }

    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {2,1};

        System.out.println(canCompleteCircuit(A, B));
    }
}
