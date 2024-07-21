package CLASS_OBJECTS;

import java.util.Scanner;

// class created by me

    class Average{
        // funtion or method written by me with 3 integer parameters
        int avg(int num1, int num2 , int num3){
            int r = (num1+num2+num3)/3;
            return r;
        }
    }



public class method_avg_3no_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three  numbers to find avg of them");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Average ans = new Average();// object created by me of my class
        int result = ans.avg(a, b, c); // method called by me by giving arguments
        System.out.println();
        System.out.println(result);


        
    }
    
}
