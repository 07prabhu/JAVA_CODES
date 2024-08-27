package Methods;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
       // String B = Example();
        System.out.println("welcome " + Example() + " nice to meet u");
    }

    static String Example(){

        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        return A;
    }
    
}
