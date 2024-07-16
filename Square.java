import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        System.out.println("ENTER THE SIDE OF THE SQUARE TO FIND THE AREA OF");
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        int result;
        result= (side * side) ;
        System.out.println("The area of the square is\n"+ result);
    }

    
}
