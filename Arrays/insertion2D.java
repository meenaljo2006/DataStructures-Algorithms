package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class insertion2D {

    

    public static int[][] createArray(int m,int n,int[][]arr){
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
        return arr;
    }

    public static int[][] insertElt(int arr[][],int row,int col, int num){
        
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = num;
                System.out.println("Element inserted succesfully");
            } else{
                System.out.println("Element can't be inserted");
            }

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound");
        }

        return arr;
        

    }

    public static int[][] deleteElt(int arr[][],int row,int col){
        
        arr[row][col] = Integer.MIN_VALUE;
        return arr;

    }

    public static void printArray(int[][]arr){
         System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter No. of rows = ");
        int m = sc.nextInt();

        System.out.print("Enter No. of columns = ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];

        createArray(m,n, arr);
        insertElt(arr,0,0,0);
        insertElt(arr,1,2,3);
        insertElt(arr,0,3,2);
        insertElt(arr, 0, 7,5);
        insertElt(arr, 0,0,0);
        printArray(arr);
        deleteElt(arr, 0,3);
        printArray(arr);


        sc.close();


         




     }


    
}
