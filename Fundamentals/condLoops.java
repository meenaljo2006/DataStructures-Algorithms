package Fundamentals;
import java.util.*;

public class condLoops {

    static void evenOdd(int num){
        if(num%2==0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
    }

    static void posNeg(int num){
        if(num>0){
            System.out.println("Positive Number");
        } else if(num==0){
            System.out.println("Number is 0");
        }else{
            System.out.println("Negative Number");
        }
    }
    
    static void Largest(int num1, int num2, int num3){
        if((num1>num2) && (num1>num3)){
            System.out.println(num1);
        } else if((num2>num1)&&(num2>num3)){
            System.out.println(num2);
        } else{
            System.out.println(num3);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        evenOdd(num);
        posNeg(num);

        System.out.print("Enter three Numbers = ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.print("Which Number is greatest ? ");
        Largest(num1,num2,num3);

        System.out.print("Even Numbers from 0 to "+num+" = ");
        for(int i=0;i<num;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.print("Factorial of Number "+num+" = ");
        int Factorial=1;
        for(int i=1;i<=num;i++){
            Factorial = Factorial*i;
        }
        System.out.println(Factorial);






        sc.close();

    }
    
}
