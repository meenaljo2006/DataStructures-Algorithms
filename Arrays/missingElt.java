package Arrays;

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
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6};
        System.out.println("Missing Elt in array = "+findMissingNumberInArray(arr));
        
    }
    
}

//TC = O(N)
//SC = O(1)
