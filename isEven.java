package CLASS_OBJECTS;

import java.util.Scanner;

class check{  //class created

    boolean isEven(int a){ //method created in class with return type boolean
        boolean rvalue;
        if(a%2==0){
            rvalue=true;
        }else{
            rvalue=false;
        } 
        return rvalue;
    }
}

public class isEven {
    public static void main(String[] args) {
        System.out.println("enter the no, to check even or odd");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        check ans = new check();  //object created of my class
        boolean result = ans.isEven(n);  // called is even method with giving parameter of int type

        if(result)    // displaying result
        
        System.out.println("true it is even number");
        else
        System.out.println("false it is odd number");


        
    }
    
}
