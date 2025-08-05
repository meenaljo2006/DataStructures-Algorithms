import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swap {

    public static void main(String[] args) {

        //swap two number --- TC=O(1) SC=O(1)

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(2,5,9,3,6));
        int index1 = 1;
        int index2 = 3;

        int temp = list.get(index2);          
        list.set(index2, list.get(index1));
        list.set(index1, temp);

        System.out.println(list);

        Collections.sort(list); // sort the array in ascending order
        System.out.println(list);

        //for descending order - we use comparator - functions which define logic
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        //Collections - Class
        //Collection - interface
        
    }
    
}


