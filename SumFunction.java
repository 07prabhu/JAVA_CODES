package Methods;
import java.util.Scanner;
public class SumFunction {
    public static void main(String[] args) {
        int ans=sum3(50,60);
        System.out.println(ans);
        
    }
    static int sum3(int a , int b){
        int sum3= a+b;
        return sum3;


    }

    static int sum2(){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers for addition");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        return sum;
        

    }
     static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers for addition");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is = "+ sum);
    }
}
