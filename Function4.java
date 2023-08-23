
import java.util.*;
public class Function4 {
    
    public static void printAvg(double a, double b, double c){
        double avg = (a+b+c)/3;
        System.out.println("Avgerage is : " + avg);
        return;
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        printAvg(a, b, c);
    }
}
