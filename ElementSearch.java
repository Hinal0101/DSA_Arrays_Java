public class ElementSearch {

    public static int search(int[] arr,int target){
        int min=minSearch(arr);
        if(arr[min]<=target&&target<=arr[arr.length-1]){
            return search(arr,min,arr.length-1,target);
        }
        else{
            return search(arr,0,min,target);
        }
    }

    public static int search(int[] arr,int left,int right,int target){
        int l=left;
        int r=right;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static int minSearch(int arr[]){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(mid>0 && arr[mid-1]>arr[mid]){
                return mid;
            }
            else if(arr[left]<=arr[mid] && arr[mid]>arr[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return left;
    }
    public static void main(String args[]){
        //min element
        int arr[]={4,5,6,1,2,3};
        int target=2;
        System.out.println(search(arr,target));
    }
}
