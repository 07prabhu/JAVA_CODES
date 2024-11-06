package DSA_CODES;

public class Pattern14 {
    public static void main(String[] args) {
        char CH = 'A';
        char ch = 'a';
        for (int row = 1; row <= 4; row++) {
            if (row == 1 || row == 3) {
                for (int col = 1; col <= 4; col++) {
                    System.out.print("  " + CH);
                    CH++;
                }
            } else {
                for (int col = 1; col <= 4; col++) {
                    System.out.print("  " + ch);
                    ch++;
                }
            }

            System.out.println();

        }
    }

}
