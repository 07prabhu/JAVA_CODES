package conditional_statements;

import java.util.Scanner;

public class numcheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to check positive or negative");
        int num = input.nextInt();

        if(num>0)
        System.out.println("the number is positive");
        else
        System.out.println("the mnumber is negative");

    }
    
}
