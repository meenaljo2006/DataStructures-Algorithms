import java.util.ArrayList;
import java.util.Arrays;

public class maxWater {

    public static void main(String[] args) {
        
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        int maxWaterStored = Integer.MIN_VALUE;

        // for(int i=0;i<height.size();i++){           //TC = O(n^2)  SC=O(1) --- Brute Force Approach
        //     for(int j=i+1;j<height.size();j++){
        //         int width = j-i;
        //         int maxWater = width*Math.min(height.get(i), height.get(j));
        //         if(maxWater>maxWaterStored){
        //             maxWaterStored=maxWater;
        //         }
        //     }

        // }

        int i=0;
        int n= height.size()-1;
        while(i<n){      // TC = O(N) ---- Two Pointer Approach
            int width = n-i;
            int maxWater = width*Math.min(height.get(i), height.get(n));
            maxWaterStored = Math.max(maxWaterStored, maxWater);

            if(height.get(n)>height.get(i)){
                i++;
            } else{
                n--;
            }
        }

        System.out.println(maxWaterStored);
    }
    
}
