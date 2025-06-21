public class MajorityElement {
    
    public static void majorityElement(int nums[]){
        int count=0,ele=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
            }

            count+=(ele==nums[i])?1:-1;
        }
        System.out.println("Majority element is: "+ele);
    }
    public static void main(String args[]){
        int nums[]={2,2,1,1,1,2,2};
        majorityElement(nums);
    }
}
