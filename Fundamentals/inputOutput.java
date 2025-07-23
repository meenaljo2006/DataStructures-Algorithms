package Fundamentals;
import java.util.*;


public class inputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello,Java");

        System.out.print("Enter your Name = ");
        String name = sc.nextLine();
        System.out.print("Enter your Age = ");
        int age = sc.nextInt();
        System.out.println("Hello "+name+", You are "+age+" years old.");

        System.out.print("Enter Two numbers = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);

        System.out.print("Enter the radius of circle to get the area of circle = ");
        float pi = 3.14f;
        float r = sc.nextFloat();
        float area = pi*r*r;
        System.out.println(area);





        sc.close();
    }
    
}
