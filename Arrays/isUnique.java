package Arrays;

public class isUnique {

    public static boolean isUnique(int[] intArray) {

        int result = 0;
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[i]==intArray[j]){
                    result = 0;  
                } else{
                    result =1;
                }
            }
        }

        if(result==0){
            return false;
        } else{
            return true;
        }


        
    }

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 2};
        System.out.println(isUnique(intArray));
        


    }
    
}
