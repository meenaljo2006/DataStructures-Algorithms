package Arrays;

import java.util.Arrays;

public class bestScore {
    
    public static int[] findTopTwoScores(int[] array){

        int[] newArr = new int[2];
        int topScore = Integer.MIN_VALUE;
        int secTopScore = Integer.MIN_VALUE;

        // for(int i=0;i<array.length;i++){
        //     if(array[i]>topScore){
        //         topScore=array[i];
        //         secTopScore=topScore;
        //     }
        // }
        
        // for(int j=0;j<array.length;j++){
        //     if((array[j]>secTopScore) && array[j]!=topScore ){
        //         secTopScore = array[j];
        //     }
        // }

        if(array.length<2){
            return array;
        }
        
        for(int i=0;i<array.length;i++){
            if (array[i]>topScore){
                secTopScore = topScore;
                topScore = array[i];
            }
            else if(array[i]>secTopScore && array[i]!=topScore){
                secTopScore = array[i];
            }
        }

        if(secTopScore == Integer.MIN_VALUE){
            newArr = new int[1];
            newArr[0]=topScore;
        } else{
             newArr[0]=topScore;
             newArr[1]=secTopScore;
        }

        return newArr;

    }

    public static void main(String[] args) {

        int [] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] arr1 = {90,90,90};
        int[] arr = {};
        System.out.println(Arrays.toString(findTopTwoScores(arr1)));
        System.out.println(Arrays.toString(findTopTwoScores(arr)));
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));
        
    }
    
}

// TC = O(N)
// SC = O(1)
