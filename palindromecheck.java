package CLASS_OBJECTS_methods;

import java.util.Scanner;



class pcheck{
    public static String result(int a){
        
        int Rnumber=0;
        int temp = a;

        while(temp!=0){
            int lastdigit = temp%10; 
            Rnumber=Rnumber*10+lastdigit;
             temp=temp/10;

        }

        if(a==Rnumber){
            String A ="the number is palindrome" ;
            return A;
             
            
        }else{
            String B = "the number is NOT palindrome";
            return B;
            
        }

        
    }
}



public class palindromecheck {
    public static void main(String[] args) {


        System.out.println("enter the number to palindrome check");
        Scanner sc = new Scanner(System.in);
        int Onumber = sc.nextInt();
        pcheck obj = new pcheck();
        String output =obj.result(Onumber);
        System.out.println(output);

      }
    
}
