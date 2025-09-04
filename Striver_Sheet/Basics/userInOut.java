// Complete the function printNumber which takes an integer input from the user and prints it on the screen.

package Striver_Sheet.Basics;

import java.util.Scanner;

public class userInOut {

    public static void printNumber(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNumber(sc);
        sc.close();
    }



    
}
