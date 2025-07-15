package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class insertion1D {

    public static int[] createArray(int n,int[]arr){
        for(int i =0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
        return arr;
    }

    public static int[] insertElt(int arr[],int pos, int num){
        
        try{
            if(arr[pos] == Integer.MIN_VALUE){
                arr[pos] = num;
                System.out.println("Element inserted succesfully");
            } else{
                System.out.println("Element can't be inserted");
            }

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        return arr;
        

    }

    public static int[] deleteElt(int arr[],int pos){
        
        arr[pos] = Integer.MIN_VALUE;
        return arr;

    }

    public static void printArray(int[]arr){
         System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        System.out.print("Enter Size of array = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        createArray(n, arr);
        insertElt(arr,0,0);
        insertElt(arr,1,2);
        insertElt(arr,4,3);
        insertElt(arr, 0, 7);
        insertElt(arr, 10,9);
        printArray(arr);
        deleteElt(arr, 4);
        printArray(arr);


        sc.close();


         




     }
    
}
