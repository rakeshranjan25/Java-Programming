import java.util.*;
public class Function8 {
    
    public static boolean isEligible(int age){
        if(age>=18){
            return true;
        }
        return false;
    }

    public static void main(String []args){

        System.out.print("Enter the age for person is eligible to vote : ");
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();

        System.out.println(isEligible(age));
    }
}
