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

    public static boolean isSquare(int[][] arr){

        int row = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length!=row){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        if(isSquare(arr)){
            int result = sumDiagonalElements(arr);
            System.out.println(result);   
        } else{
            System.out.println("Not a square 2-d array");

        }


    }
    
}

// TC = O(N)
// SC = O(1)
