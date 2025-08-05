// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Iterator;

import java.util.*;

public class creation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,1,2,3)); 
        numbers.addAll(Arrays.asList(20,25,65,35));
        numbers.add(100);
        numbers.add(1,80);
        System.out.println(numbers.size());

        ArrayList<String> names = new ArrayList<String>();
        System.out.print("Enter number of elts you want to add = ");
        int n = sc.nextInt();

        System.out.println("Enter the names you want to add = ");
        for(int i=0;i<n;i++){
            names.add(sc.next());
        }
        System.out.println(names);

        //traversing arrayList - 3 methods

        for(int i=0;i<numbers.size();i++){    // for loop
            System.out.println(numbers.get(i));
        }

        for(String name:names){     // for each
            System.out.println(name);

        }

        Iterator <String> i = names.iterator();   // using Iterator
        while(i.hasNext()){
            String name = i.next();
            System.out.println(name);
        } 

        //searching

        for(String name : names){
            if(name.equals("dhruv")){
                System.out.println("name found");
                break;
            }  
        }

        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.indexOf(66));
        System.out.println(names.indexOf("dhruv"));

        System.out.println(numbers.contains(3));
        System.out.println(numbers.contains(6));
        System.out.println(names.contains("dhruv"));

        //deleting elts

        numbers.remove(5); // will delete index 10 elt
        numbers.remove(Integer.valueOf(20)); // will delete elt 20

        names.remove("dhruv");
        names.remove(2);

        System.out.println(names);
        System.out.println(numbers);


        sc.close();
    }
    
}
