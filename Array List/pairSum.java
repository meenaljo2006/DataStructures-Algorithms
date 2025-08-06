import java.util.ArrayList;
import java.util.Arrays;

public class pairSum {

    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int target = 5;
        int sum =0;

        int leftPtr = 0;
        int rightPtr = list.size()-1;
        while(leftPtr<rightPtr){
            sum = list.get(rightPtr)+list.get(leftPtr);
            if(sum==target){
                System.out.println(leftPtr);
                System.out.println(rightPtr);
                break;
            } else if(sum<target){
                leftPtr++;
            } else if(sum>target){
                rightPtr--;
            }
        }

    }
    
}
