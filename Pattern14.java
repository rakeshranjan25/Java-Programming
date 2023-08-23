public class Pattern14 {

    public static void main(String []args){

        int n = 4;
        
        //upper part
        for(int i = 1; i<=n; i++){

            //spaces
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //stars
            int stars = (2*i)-1;
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //lower part
        for(int i = n; i>=1; i--){

            //spaces
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //stars
            int stars = (2*i)-1;
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
