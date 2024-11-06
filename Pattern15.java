package DSA_CODES;

public class Pattern15 {
    public static void main(String[] args) {
        char ch = 'A';
        int num = 2;

        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                if (col == 1 || col == 3) {
                    System.out.print(" " + ch);
                    ch++;
                    ch++;

                } else {
                    System.out.print(" " + num);
                    num = num + 2;
                }
            }
            System.out.println();
        }
    }

}
