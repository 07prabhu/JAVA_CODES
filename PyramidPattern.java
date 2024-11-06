package DSA_CODES;

public class PyramidPattern {
    public static void main(String[] args) {
        for (int row = 0; row < 6; row++) {
            for (int col = 1; col <= 5 - row; col++) {
                System.out.print("  ");
            }
            int a = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + a);
                a--;
            }

            int b = row;
            for (int col = 2; col <= row; col++) {
                System.out.print(" " + col);

            }

            System.out.println();

        }
    }

}
