import java.util.ArrayList;
import java.util.Arrays;

public class multiDim {

    public static void main(String[] args) {

        ArrayList<ArrayList> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("hello","bye","hi"));

        mainList.add(list);
        mainList.add(list2);

        // System.out.println(mainList);

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(3,6,9,12,15));
        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>(Arrays.asList(list3,list4,list5));
        
        //Traverse
        for(int i=0;i<mainList2.size();i++){
            ArrayList<Integer> currList = mainList2.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }

            System.out.println();
        }

        System.out.println(mainList2);
        

    }
    
}
