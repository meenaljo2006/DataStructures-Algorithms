package Arrays;

public class isUnique {

    public static boolean isUnique(int[] intArray) {

    
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[i]==intArray[j]){
                    return false;
                }
            }
        }

        return true;

        
    }

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 2};
        System.out.println(isUnique(intArray));
        


    }
    
}

//TC = O(N^2) -brute froce approach and optimized approach using hashset - later
//SC = O(1)