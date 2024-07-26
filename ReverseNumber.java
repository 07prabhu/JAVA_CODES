package LOOPS;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to get a reverse of it");
        int n = sc.nextInt();
        int Rn=0;

        while(n!=0){
            int lastdigit=n%10;
            Rn=(Rn*10) + lastdigit;
            n=n/10;
            
        }
        System.out.println(Rn);
         
    }
    
}
