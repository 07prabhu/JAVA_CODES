package ARRAY;

import java.util.Scanner;


public class sumofelements {
    public static void main(String[] args) {
        int arr[]= new int [5];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the element in aarray");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
                 }
        

        int sum = 0 ;

        for(int i=0;i<arr.length;i++){

            sum=sum + arr[i] ;

        }

        System.out.print("the sum of array is  "+ sum);
    

    }
}

