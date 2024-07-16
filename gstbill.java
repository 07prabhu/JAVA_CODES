import java.util.Scanner;

public class gstbill {
    public static void main(String[]args){
        int A ;
        int B ;
        int C ;
        int total;
        double gst = 0.18;
       
        Scanner input =new Scanner (System.in);
        
        System.out.println("enter the values of three items you purchased");
         A= input.nextInt();
         B= input.nextInt();
         C= input.nextInt();

         total=A+B+C;

         double gstbill=total+(total*gst);

         System.out.println("the gst bill is"+gstbill);
       

    }
    
}
