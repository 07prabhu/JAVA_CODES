package DSA_CODES;

import CLASS_OBJECTS_methods.sum_of_digits_integer;

public class AdditionOfnum {
    public static void main(String[] args) {

        int num = 22222;
        int a;
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            a = num % 10;
            sum = sum + a;
            num = num / 10;

        }
        System.out.println(sum);
    }

}
