import java.util.ArrayList;
import java.util.Arrays;

public class reverse {
    
    public static void main(String[] args) {

       //printing reverse of an ArrayList 
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5)) ;
        for(int i=list.size();i>0;i--){
            System.out.println(list.get(i-1));
        }
        
    }
    
}
