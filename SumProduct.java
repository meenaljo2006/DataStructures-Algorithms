public class SumProduct{

    public static int sum(int[] arr){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }

    public static int product (int[] arr) {
        int total = 1;
        for(int i=0;i<arr.length;i++){
            total*=arr[i];
        }
        return total;   
    }

    public static int[] sumAndProduct (int[] arr){
        int Sum = 0;
        int product = 1;
        
        for(int i=0;i<arr.length;i++){
            Sum+=arr[i];
            product*=arr[i];
        }
        int total[] = {Sum,product};

        return total;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sum(arr));
        System.out.println(product(arr));
        int [] result = sumAndProduct(arr);
        System.out.println("sum  = "+ result[0]);
        System.out.println("Product = "+ result[1]);
    }

}