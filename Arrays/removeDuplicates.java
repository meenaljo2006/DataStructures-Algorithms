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

    static int[] removeDuplicates(int[]arr){
         
        int[] newArr = new int[arr.length];
        int index=0;
        newArr[index] = arr[0];
        for(int i=1;i<arr.length;i++){
            int found =0;
            int k=index;
            while(k>=0){
                if(arr[i]==newArr[k]){
                    found=1;
                    break;
                }
                k--;
            }

            if(found==0){
                index++;
                newArr[index]=arr[i];
            }  
        }

        return Arrays.copyOf(newArr, index+1);

    }


    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        int []result = removeDup(arr);
        int[] arr2 = {3,1,2,1,3,2};
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(removeDuplicates(arr2)));
    }
    
}

//TC = O(N)
//SC = O(N)