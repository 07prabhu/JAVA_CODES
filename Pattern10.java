package DSA_CODES;

public class Pattern10 {
    public static void main(String[] args) {
        int num = 1;
        for (int row = 1; row <= 5; row++) {
            if (row <= 3) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(num);
                    num++;
                }
            } else {
                for (int col = 1; col <= 6 - row; col++) {
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
        }

    }
}
