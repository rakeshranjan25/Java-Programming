
import java.util.*;
public class Function6 {
    
    public static int getGreater(int a, int b){
        if(a<b){
            return b;
        }
        else{
            return a;
        }
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Greater Number is : " + getGreater(a, b));
    }
}
