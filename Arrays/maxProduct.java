package Arrays;

public class maxProduct {

    public static String maxProduct(int[] intArray) {

        
        // int maxProduct = Integer.MIN_VALUE;
        // for(int i=0;i<intArray.length;i++){
        //     for(int j=i+1;j<intArray.length;j++){

        //          if((intArray[i] * intArray[j])>maxProduct){
        //             maxProduct = intArray[i] * intArray[j];
        //             max_productNum = (intArray[i]+","+intArray[j]);
        //          }

        //     }

        // }

        String max_productNum ;

        int Firstlargest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;


        for(int i=0;i<intArray.length;i++){
            if(Firstlargest<intArray[i]){
                Secondlargest = Firstlargest;
                Firstlargest = intArray[i];
            }

            else if(intArray[i]>Secondlargest){
                Secondlargest = intArray[i];
            }
            
            if(intArray[i]<smallest){
                SecondSmallest = smallest;
                smallest = intArray[i];
            }
            else if(intArray[i]<SecondSmallest){
                SecondSmallest = intArray[i];
            }


        }

     
        int product1 = Firstlargest*Secondlargest;
        int product2 = smallest*SecondSmallest;

        if(product1>product2){
            max_productNum = "("+Firstlargest+","+Secondlargest+")";
        } else{
            max_productNum = "("+smallest+","+SecondSmallest+")";
        }

        return max_productNum;


        
        
    }


    public static void main(String[] args) {

        int[] intArray = {-1, -5, -3, -9, -2};
        System.out.println(maxProduct(intArray));
        
    }
    
}

//TC= O(n^2) - this is a brute force approach
//SC = O(1)
