package Arrays;
import java.util.*;

public class MaxSubArraySum {

    public static void maxsumsubarr(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int currsum=0;
                int end=j;
                for(int k=start;k<=end;k++){
                    currsum+=arr[k];
                }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum of subarray is "+maxsum);
    }
    
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};

        maxsumsubarr(arr);
    }
}
