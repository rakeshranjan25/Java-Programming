import java.util.*;

public class Switch {
    
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the secound number");
        int b = sc.nextInt();

        System.out.println(" 1 = + \n 2 = - \n 3 = * \n 4 = /");

        int operator = sc.nextInt();

        switch(operator){
            case 1 : System.out.println(a+b);
            break;

            case 2 : System.out.println(a-b);
            break;
            
            case 3 : System.out.println(a*b);
            break;

            case 4 : if (b == 0){
                System.out.println("Invalid Divison");
            }else{
                System.out.println(a/b);
            }
            break;

            default : System.out.println("invalid Operator");


        }

    }
}
