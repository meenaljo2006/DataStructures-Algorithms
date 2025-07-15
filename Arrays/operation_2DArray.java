package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class operation_2DArray {

static Scanner sc = new Scanner(System.in);  // static - shareable

    //Create an array
    public static int[][] createArray(int m,int n,int[][]arr){
        System.out.print("Enter the elements of array one bye one = ");
        for(int row =0;row<m;row++){
            for(int col=0;col<n;col++){
                 arr[row][col] = sc.nextInt();
            }
           
        }
        return arr;
    }

    //print an array
    public static void printArray(int[][]arr){
         System.out.println(Arrays.deepToString(arr));
    }

    // Traversing an array  
    public static void traversalArray(int[][]arr){
        System.out.println("Traversal of Array = ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            
        }
    }

    //Searching in Array
    public static void searchInArray(int[][]arr,int element){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==element){
                    System.out.println("Element found at index "+"["+i+"]"+"["+j+"]");
                    return;
                }
            } 
        }
        System.out.println("element not found");

    }

    public static void main(String[] args) {

        System.out.print("Enter No. of rows = ");
        int m = sc.nextInt();

        System.out.print("Enter No. of columns = ");
        int n = sc.nextInt();


        int [][] arr = new int[m][n];
        createArray(m,n,arr);
        printArray(arr);
        traversalArray(arr);

        System.out.print("Enter the element you want to search ");
        int eltToSearch = sc.nextInt();
        searchInArray(arr,eltToSearch);

        sc.close();
    }
    
}
