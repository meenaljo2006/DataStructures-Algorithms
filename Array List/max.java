import java.util.ArrayList;
import java.util.Arrays;

public class max {

    public static void main(String[] args) {

        // Find maximum in ArrayList --- TC = O(N) SC = O(1)

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(2,5,9,3,6));
        int max = Integer.MIN_VALUE;

    
        for(Integer num : list){   
            if(num>max){
                max=num;
            }

        }

        System.out.println(max);
        
    }
    
}
