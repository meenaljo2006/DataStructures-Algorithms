package Fundamentals;

public class palindrome {

    public static void main(String[] args) {
        
        int num = 123;

        int original = num;
        int reverse=0;

        while(num>0){
            int lastDigit = num%10;
            reverse = reverse*10+lastDigit;
            num=num/10; 
        }

        if(reverse==original){
            System.out.println(original+" is palindrome number");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
