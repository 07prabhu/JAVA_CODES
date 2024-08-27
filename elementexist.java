package ARRAY;

public class elementexist {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};
        int target=1000;
        boolean check=true;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                check=true;
                break;
            }else
            check=false;
        }

        if(check){
            System.out.println(target + " number is present in array");
        }else
        System.out.println("not present");
    }
    
}
