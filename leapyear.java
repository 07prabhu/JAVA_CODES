package conditional_statements;
import  java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter the year that u want to check is it a leap year");
        int n= input.nextInt();
        
        if(n%4==0){
            
            if(n%100==0){
                
                if(n%400==0)
                System.out.println("it is a leap year");

            }
            else
            System.out.println("it is a leap year");

        }
        else
        System.out.println("not a leap year");

    }
    
}
