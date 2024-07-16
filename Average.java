
import java.util.Scanner;

public class Average{
    public static void main(String[] args) {

		int avg;
		Scanner input = new Scanner(System.in);

		System.out.println("enter first number");

        int a= input.nextInt();

		System.out.println("enter the second no") ;

		int b=input.nextInt();
		System.out.println("enter the second no") ;
		int c=input.nextInt();

		avg= (a+b+c) / 3;

        
		System.out.println("the average is\n"+avg);
		   }
}