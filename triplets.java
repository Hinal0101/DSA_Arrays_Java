import java.util.*;
public class triplets {
    public static List<List<Integer>> subarraytriplets(int nums[]){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet=new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result=new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }
    public static void main(String args[]){
        int nums[]={-1,0,1,2,-1,4};
        System.out.println(subarraytriplets(nums));
    }
}
