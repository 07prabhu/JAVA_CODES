package DSA_CODES;

public class Pattern19 {
    public static void main(String[] args) {
        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= 7; col++) {
                if (row == 1 || row == 7 || col == 1 || col == 7) {
                    System.out.print(" 4");
                } else if (row == 2 || row == 6 || col == 2 || col == 6) {
                    System.out.print(" 3");
                } else if (row == 3 || row == 5 || col == 3 || col == 5) {
                    System.out.print(" 2");
                } else {
                    System.out.print(" 1");
                }
            }
            System.out.println();
        }
    }

}
