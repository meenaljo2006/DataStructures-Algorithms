package Arrays;

import java.util.Arrays;

public class twoSum {

    static int[] twoEltsSum(int[] nums,int target){

        int[] index = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    index[0]=i;
                    index[1]=j;
                    
                }
            }
        }
        return index;

    }

    public static void main(String[] args) {
        
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        System.out.println(Arrays.toString(twoEltsSum(arr, target)));

    }

    
    
}


//TC = O(N^2)  optimized way is hashmap will od later
//SC = O(1)