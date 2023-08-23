import java.util.*;
public class Function2 {

    // Funtion for product two numbers
    public static int CalculateProduct( int a, int b){
        return a*b;
    }
    
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
  
        // Function call and print
        System.out.println("Product of two numbers : " + CalculateProduct(a, b));

    }
}
