package LOOPS;

import java.util.Scanner;

public class Fibnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        int count=2;
        System.out.println("enter the nth number u want the fibonacee number");
        int n = sc.nextInt();
        int fibnum=a+b;

        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;

            /* b=fibnum;
            fibnum=a+b; */
            //System.out.println(b);
            count++;


        }System.out.println(b);
       
        
        //System.out.println(fibnum);
        
    }

}
