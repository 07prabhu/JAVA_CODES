package DSA_CODES;

public class Pattern11 {
    public static void main(String[] args) {

        for (int row = 1; row <= 4; row++) {
            int num = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

}
