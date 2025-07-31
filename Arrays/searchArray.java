package Arrays;

public class searchArray {

    public static int searchInArray(int[] intArray, int valueToSearch) {

        for(int i=0;i<intArray.length;i++){
            if(intArray[i]==valueToSearch){
                return i;
            }
        }

        return -1;
        
    }

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6};
        int result = searchInArray(intArray, 6);
        if(result==-1) System.out.println("Element not found");
        else{
            System.out.println("Element found at position "+result);
        }
        
    }
    
}

//TC = O(N) --- Linear Search
//SC = O(1)
