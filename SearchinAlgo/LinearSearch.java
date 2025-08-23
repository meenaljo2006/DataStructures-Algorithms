package SearchinAlgo;

public class LinearSearch {

    public static int linear(int[]arr,int search){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return i;
            }
        }

        return -1;
    
    }

    public static void main(String[] args) {
            int [] arr = {1,4,2,6,3,8,6,9};
            int search = 8;
            int result = linear(arr, search);
            if(result==-1){
                System.out.println("Element not found");
            } else{
                System.out.println("Element found at index "+result);
            }



    }
    
}

//TC = O(N)
//SC = O(1)