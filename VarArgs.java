package Methods;

import java.util.Scanner;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       fun(20,30,40,50,600);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
