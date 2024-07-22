package CLASS_OBJECTS_methods;

import java.util.Scanner;

class answer{
    int result(int a){

        int sum=0;

        int temp = a;

        while(temp!=0){
        
        int lastgidit = temp%10;

        sum=sum+lastgidit;

        temp=temp/10;

        }

        return sum;
    }
}

public class sum_of_digits_integer {
    public static void main(String[] args) {

        //input

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to have sum of digits");
        int num = sc.nextInt();
        
        //call method

        answer obj = new answer();
        int R = obj.result(num);
        System.out.println(R);
    }
    
}
