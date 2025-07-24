package Arrays;

public class sumDiagonal {

    public static int sumDiagonalElements(int[][] array) {

        int sum=0;

        // for(int i=0;i<array.length;i++){
        //     for(int j=0;j<array.length;j++){
        //         if(i==j){
        //             sum = sum+array[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<array.length;i++){
            sum = sum+array[i][i];
        }

        return sum;


    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int result = sumDiagonalElements(arr);
        System.out.println(result);

    }
    
}

// TC = O(N)
// SC = O(1)
