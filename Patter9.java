package DSA_CODES;

public class Patter9 {
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            if (row <= 5) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(" *");
                }
            } else {
                for (int col = 1; col <= 10 - row; col++) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }

}
