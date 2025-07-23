package Arrays;

public class max_min {
    public static void main(String[] args) {
        int[] arr = {5,6,20,7,10,81,15,9};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        int avg =0;
        for(int i=0;i<arr.length;i++){
            avg = avg+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }

        avg= avg/arr.length;

        int countEven =0;
        int countOdd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                countEven++;
            } else{
                countOdd++;
            }
        }

        System.out.println("Minimum = "+min);
        System.out.println("Maximum = "+max);
        System.out.println("Average = "+avg);
        System.out.println("Number of oddNumbers = "+countOdd);
        System.out.println("Number of evenNumbers = "+countEven);

    }
    
}
