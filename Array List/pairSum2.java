import java.util.ArrayList;
import java.util.Arrays;

public class pairSum2 {

    public static void main(String[] args) {

        //ciruclarly two pointer approach beacuse it is not completely  sorted it is rotated
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 1, 2, 3, 4));
        int target = 10;
        int sum=0;

        int leftPtr =0;
        int rightPtr=list.size()-1;

        while(leftPtr<rightPtr){

            sum = list.get(rightPtr)+list.get(leftPtr);
            if(sum==target){
                System.out.println(leftPtr);
                System.out.println(rightPtr);
                break;
            } else if(sum>target){
                leftPtr++;
            } else if (sum<target){
                rightPtr--;
            }




        }
        
    }
    
}
