package arrays;

public class PeakElement {

    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int peakElement = 0;
        for(int index=0; index < n-1; index++) {
            if(arr[index] > arr[index + 1]) {
                peakElement = index;
                break;
            } else {
                peakElement = index+1;
            }
        }
        return peakElement;
    }
}
