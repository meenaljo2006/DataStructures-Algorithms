package SortingAlgo;

public class bubble {

    public static void main(String[] args) {

        int [] arr = {5,9,3,1,2,8,4,7,6};
        int n = arr.length;

        // Increasing Order
        for(int i=0;i<n-1;i++){  //total n-1 passes
            for(int j =0;j<n-i-1;j++){  //n-i-1 comparisons
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

        System.out.print("Increasing Order - ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //Decreasing Order
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Decreasing Order - ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        

    }
    
}

//TC = O(N^2)
//SC = O(1)