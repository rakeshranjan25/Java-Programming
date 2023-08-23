
import java.util.*;
public class Function7  {
    
    public static double getCircumference(double radius){
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }

    public static void main(String []args){

        System.out.print("Enter the raidus : ");

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        
        System.out.println("circumference is : " + getCircumference(radius));
    }
}
