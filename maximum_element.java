package ARRAY;

import java.util.Scanner;

public class maximum_element {
    public static void main(String[] args) {
        
        int arr[]=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element is "+ max);

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum element is "+ min);
    }
    
}
