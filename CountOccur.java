package LOOPS;

import java.util.Scanner;

public class CountOccur {
    public static void main(String[] args) {
        long n=1385757879;
        int ans=0;
       //long temp=n;
        System.out.println("enter the number u want to check repeatation");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        while(n!=0){
            long lastdigit = n%10;
            if(lastdigit==x){
                ans++;
            }
             n=n/10;
        } 
        System.out.println(ans);
    }
    
}
