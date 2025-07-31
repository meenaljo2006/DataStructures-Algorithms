package Arrays;

public class maxProduct {

    public static String maxProduct(int[] intArray) {

        String max_productNum = "";
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){

                 if((intArray[i] * intArray[j])>maxProduct){
                    maxProduct = intArray[i] * intArray[j];
                    max_productNum = (intArray[i]+","+intArray[j]);
                 }

            }

        }

        System.out.println(maxProduct);
        return max_productNum;


        
        
    }


    public static void main(String[] args) {

        int[] intArray = {5};
        System.out.println(maxProduct(intArray));
        
    }
    
}

//TC= O(n^2)
//SC = O(1)
