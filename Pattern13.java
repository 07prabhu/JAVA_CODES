package DSA_CODES;

public class Pattern13 {
    public static void main(String[] args) {
        char ch = 'A';
        int num = 1;
        for (int row = 1; row <= 4; row++) {

            if (row == 2 || row == 4) {
                for (int col = 1; col <= 4; col++) {
                    System.out.print(" " + ch);
                    ch++;
                }
            } else {
                for (int col = 1; col <= 4; col++) {
                    System.out.print(" " + num);
                    num++;
                }
            }
            System.err.println();
        }
    }

}
