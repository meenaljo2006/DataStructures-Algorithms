package Arrays;

import java.util.Arrays;

public class permutation {

    public static boolean permutation(int[] array1,int[] array2){

        if(array1.length!=array2.length){
            return false;
        } 

        Arrays.sort(array1);  // sort method - new learning --- nlogn
        Arrays.sort(array2); // ---- nlogn

        for(int i=0;i<array1.length;i++){ // --- n
            if(array1[i]!=array2[i]){
                return false;
            }
        }

        // int sum1 = 0;  wrong approach as it doesnot work for all cases
        // int sum2 = 0;
        // int mul1 = 1;
        // int mul2 = 1;

        // for(int i=0;i<array1.length;i++){
        //     sum1+=array1[i];
        //     sum2+=array2[i];
        //     mul1*=array1[i];
        //     mul2*=array2[i];
        // }

        // if(sum1==sum2&&mul1==mul2){
        //     return true;
        // } else{
        //     return false;
        // }


        return true;


    }

    public static void main(String[] args) {
        
        int[] arr1 = {1,6,6};
        int[] arr2 = {2,2,9};
        System.out.println(permutation(arr1, arr2));
    }
    
}

// TC = O(NlogN) optimized way is using hashmap giving tc as O(N)
// SC = O(1)
