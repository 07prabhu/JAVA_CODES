package DSA_CODES;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("enter the num u want to reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = 0;
        int Rnum = 0;
        do {

            r = num % 10;
            Rnum = Rnum * 10 + r;
            num = num / 10;

        } while (num != 0);
        System.out.println(Rnum);
    }

}
