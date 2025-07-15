package Arrays;

import java.util.*;
public class operations_1DArray {
    
    static Scanner sc = new Scanner(System.in);  // static - shareable

    //Create an array
    public static int[] createArray(int n,int[]arr){
        System.out.print("Enter the elements of array one bye one = ");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    //print an array
    public static void printArray(int[]arr){
         System.out.println(Arrays.toString(arr));
    }

    // Traversing an array  
    public static void traversalArray(int[]arr){
        System.out.println("Traversal of Array = ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //Searching in Array
    public static void searchInArray(int[]arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("element not found");

    }

    public static void main(String[] args) {

        System.out.print("Enter Size of array = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        createArray(n,arr);
        printArray(arr);
        traversalArray(arr);

        System.out.print("Enter the element you want to search ");
        int eltToSearch = sc.nextInt();
        searchInArray(arr,eltToSearch);

        sc.close();
    }
    
}
