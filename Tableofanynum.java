
import java.util.*;

public class Tableofanynum {

    public static void main(String []args){

        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){

            System.out.println(n*i);
        }
    }
    
}
