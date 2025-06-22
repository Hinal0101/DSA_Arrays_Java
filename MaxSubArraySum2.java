public class MaxSubArraySum2 {

    //prefix sum method

    public static void maxsubarraysum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefixarray[]=new int[arr.length];

        prefixarray[0]=arr[0];
        for(int i=1;i<prefixarray.length;i++){
            prefixarray[i]=prefixarray[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currsum=start==0?prefixarray[end]:prefixarray[end]-prefixarray[start-1];

                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }

        System.out.println("max sum="+maxsum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        maxsubarraysum(arr);
    }
}
