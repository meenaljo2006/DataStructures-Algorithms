import java.util.*;
public class TC6_reverseArray {

    public static void reverse(int[] arr){
        for(int i=arr.length;i>0;i--){
            System.out.println(arr[i-1]);// this will only print array in reverse
        }

        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];   //swapping will actually reverse the array
            arr[arr.length-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {14,21,37,42,50,80,34};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// TC = O(N)