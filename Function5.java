
import java.util.*;
public class Function5 {
    
    public static void printSum(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){

            if(i%2 !=0){
                sum = sum+i;
            }
        }
        System.out.println("odd number sum is : " + sum);
        return;
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printSum(n);
    }
}
