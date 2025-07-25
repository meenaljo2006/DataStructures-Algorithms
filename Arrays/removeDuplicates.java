package Arrays;

import java.util.Arrays;

public class removeDuplicates {

    static int[] removeDup(int[] arr){

        int[] newArr = new int[arr.length];
        
        newArr[0]=arr[0];
        int i=0;
        for(int j=0;j<arr.length-1;j++){
            if(newArr[i]!=arr[j+1]){
                newArr[i+1]=arr[j+1];
                i=i+1;
            }     
        }

        return Arrays.copyOf(newArr, i+1); //It returns only the filled part of the newArr — excluding trailing unused 0s.
        //first i elements are valid
        
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        int []result = removeDup(arr);
        System.out.println(Arrays.toString(result));
    }
    
}

//TC = O(N)
//SC = O(N)