import java.util.*;
public class Function3 {

    // Factorial of any number
    public static void printFactorial( int n){

        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;

        for (int i = n; i>=1; i--){
            factorial = factorial*i;
        }

        System.out.println("Factorial is : " + factorial);
        return;
    }
    
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

    }
}
