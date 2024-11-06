package DSA_CODES;

public class Pattern18 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            int n = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + n);
                n++;

            }
            System.out.println();
        }
    }

}
