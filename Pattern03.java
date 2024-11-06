package DSA_CODES;

public class Pattern03 {
    public static void main(String[] args) {

        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4 + 1 - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
