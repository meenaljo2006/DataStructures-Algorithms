package Arrays;

import java.util.Arrays;

public class missingElt {

    static int findMissingNumberInArray(int[] arr){

        int n = arr.length+1;

        int expectedSum = (n*(n+1))/2;
        int actualSum =0;
        for(int i=0;i<arr.length;i++){
            actualSum = actualSum+arr[i];
        }

        int missingElt = expectedSum-actualSum;


        return missingElt;

    }

    static int[] multipleMissing(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }

        System.out.println(max);

        int[] missing = new int[max];
        int index=0;
        for(int i=1;i<=max;i++){
            Boolean found = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found = true;
                    break;
                }
        
            }

            if(!found){
                if(index<max){
                    missing[index] = i;
                    index++;

                }
            }
            
        }
        return Arrays.copyOf(missing,index);


    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6};
        System.out.println("Missing Elt in array = "+findMissingNumberInArray(arr));

        // int[] arr1 = {4,3,2,7,8,2,3,1};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.toString(multipleMissing(arr2)));
        
    }
    
}

//TC = O(N)
//SC = O(1)
