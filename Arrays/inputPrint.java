package Arrays;
import java.util.*;


public class inputPrint{
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int arr[];
        arr = new int[5];
        for(int i=0;i<arr.length;i++){
            
            System.out.print("Enter the "+(i+1)+" element = ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        
        sc.close();
    }
}