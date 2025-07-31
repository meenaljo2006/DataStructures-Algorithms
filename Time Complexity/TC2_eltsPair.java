public class TC2_eltsPair{

    public static void pairsAllElt(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i]+""+arr[j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void uniquePairs(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && i<j){
                    System.out.print(arr[i]+""+arr[j]);
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        int[] arr = {1,3,4,5};
        System.out.println("All pairs = ");
        pairsAllElt(arr);
        System.out.println("Unique Pairs = ");  
        
        uniquePairs(arr);
    }

}

// Time Complexity - O(n^2)
// Space Complexity - O(1)