package DSA_CODES;

public class Countofnum {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;

        do {
            num = num / 10;
            count++;

        } while (num != 0);
        System.out.println(count);

    }

}
