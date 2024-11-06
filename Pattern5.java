package DSA_CODES;

public class Pattern5 {
    public static void main(String[] args) {

        for (int row = 1; row <= 9; row++) {
            int condition = row > 5 ? 10 - row : row;
            for (int col = 1; col <= condition; col++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
