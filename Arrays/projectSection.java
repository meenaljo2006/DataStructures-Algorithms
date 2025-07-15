package Arrays;

import java.util.Scanner;

public class projectSection {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many day's temperature? ");
        int n = sc.nextInt();

        int [] days = new int[n];

        float avg=0;
        int count =0;

        for(int i=0;i<days.length;i++){
            System.out.print("Day "+(i+1)+"'s high temp : ");
            days[i] = sc.nextInt();
            avg+=days[i];
        }

        avg=avg/n;
        System.out.println("Average = "+avg);

        for(int i=0;i<days.length;i++){
            if(days[i]>avg){
                count++;
            }
        }

        System.out.println(count+" day(s) above average");
        sc.close();
     }
    
}
