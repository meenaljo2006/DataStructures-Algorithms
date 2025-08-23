package SearchinAlgo;

public class BinarySearch {

    public static int binary(int[]arr,int search){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+(end-start))/2;
            if(arr[mid]==search){
                return mid;
            } else if(arr[mid]>search){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,45,50,55,60,67,78,79};
        int search = 45;
        int result = binary(arr, search);
        if(result ==-1){
            System.out.println("Element not found");
        } else{
            System.out.println("Element found at index "+result);
        }

        
    }
}

//TC = O(logN)
//SC = O(1)