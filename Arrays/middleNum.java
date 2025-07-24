package Arrays;

import java.util.*;

public class middleNum {

    static int[] middle(int[] arr){

        if(arr.length<=2){
            return new int[0];
        }
        int newArr[] = new int[arr.length-2];
        for(int i=0;i<arr.length-2;i++){
            newArr[i] = arr[i+1];
        }

        return (newArr);
    }
    public static void main(String[] args) {

        int arr[] = {1};
        System.out.println(Arrays.toString(middle(arr)));
        
    }
    
}

// TC = O(n) hogi kyunki n-2 loop chala
// SC = O(n) hogi kyunki array create kiya n-2 length ka 
