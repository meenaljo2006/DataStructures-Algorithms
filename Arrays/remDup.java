//Remove Duplicates and return length
package Arrays;

import java.util.*;

public class remDup {

    // static int removeDuplicates(int[] nums) {

    //     int count = 0;
    //     int index=0;
    //     if(nums.length>=1){
    //         count=1;
    //         for(int i=0;i<nums.length-1;i++){
    //             if(nums[index]!=nums[i+1]){
    //                 count=count+1;
    //                 index=index+1;
    //                 nums[index]=nums[i+1];

    //             }
    //         }
    //     }
        
    //     System.out.println(Arrays.toString(nums));

    //     return count;   
    // }

    static int removeDup(int[] arr){

        int count=1;

        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length && arr[i]==arr[j]){
                j++;
            }

            if(j<arr.length){
                count++;

                int k=i+1;
                while(k!=j && j<arr.length){
                    arr[k]=arr[j];
                    k++;
                }
                
            }



        }

        System.out.println(Arrays.toString(arr));

        return count;

    }

    public static void main(String[] args) {
        
        int [] arr ={0,0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDup(arr));
        // System.out.println(removeDuplicates(arr));
    }
    
}

//TC = O(N)
//SC = O(1)