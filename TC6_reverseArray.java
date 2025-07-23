public class TC6_reverseArray {

    public static void reverse(int[] arr){
        for(int i=arr.length;i>0;i--){
            System.out.println(arr[i-1]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {14,21,37,42,50,80,34};
        reverse(arr);
    }
}

// TC = O(N)