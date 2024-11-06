package DSA_CODES;

import java.util.Scanner;

public class PallindromeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num to check palindrome");
        int num = sc.nextInt();
        int temp = num;
        int Rnum = 0;
        do {
            int LD;
            LD = temp % 10;
            Rnum = Rnum * 10 + LD;
            temp = temp / 10;
        } while (temp != 0);

        if (Rnum == num) {
            System.out.println("it is a palindrome number");
        } else {
            System.out.println("not palindrome");
        }

    }
}
