package DSA_CODES;

public class Pattern17 {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {

            if (row <= 5) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= 7 - row; col++) {
                    System.out.print("* ");
                }

            } else {
                for (int col = 1; col <= 11 - row; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row - 5; col++) {
                    System.out.print(" *");
                }
            }
            System.out.println();

        }
    }

}
