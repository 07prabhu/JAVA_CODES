package LOOPS;

import java.util.Scanner;

import ARRAY.elementexist; 

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("enter the characters");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        System.out.println(ch);

        if(ch>='a' && ch<='z') {
            System.out.println("lower case");
        }else{
        System.out.println("upper case");
        }
    }
    
}
