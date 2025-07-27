//Remove Duplicates and return length
package Arrays;

public class remDup {

    static int removeDuplicates(int[] nums) {

        int count = 0;
        int index=0;
        if(nums.length>=1){
            count=1;
            for(int i=0;i<nums.length-1;i++){
                if(nums[index]!=nums[i+1]){
                    count=count+1;
                    index=index+1;
                    nums[index]=nums[i+1];

                }
            }
        }
        

        return count;   
    }

    public static void main(String[] args) {
        
        int [] arr ={10};
        System.out.println(removeDuplicates(arr));
    }
    
}

//TC = O(N)
//SC = O(1)