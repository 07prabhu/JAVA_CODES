package ARRAY;

import java.util.Scanner;
public class average { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many numbers are there u want to take average");
        int n = sc.nextInt();
         int arr[]=new int[n];
        // double avg;

         System.out.println("enter the number");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int sum=0;
        System.out.println("the average is  ");
        for(int i=0; i<arr.length ; i++){
             
           sum=sum+arr[i];
           


        }

        double avg = sum/n;
        System.out.println(avg);
    }
    
}
