package Methods;

public class SwapMethod {
    public static void main(String[] args) {
        
        swap(50,60);
        

     
    }

    static void swap(int b  , int c){
        int temp = b;
        b=c;
        c=temp;
        System.out.println(b);
        System.out.println(c);
      
    }
    
}
