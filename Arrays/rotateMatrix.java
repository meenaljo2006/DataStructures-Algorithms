package Arrays;

import java.util.Arrays;

public class rotateMatrix {

    public static void rotateMatrix(int[][] matrix){

        int rows = matrix.length; 
        //transpose of matrix
        for(int i=0;i<rows;i++){
            for(int j=i+1;j<rows;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        //reverse of rows
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][rows-1-j];
                matrix[i][rows-1-j] = temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix(arr);


    }
    
}

//TC = O(N^2)
//SC = O(1)
