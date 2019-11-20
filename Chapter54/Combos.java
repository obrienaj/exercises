import java.util.Scanner;

public class Combos{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = scan.nextInt();

        System.out.println("Enter R:");
        int r = scan.nextInt();

        long ncr = ncr(n, r);

        if (ncr > 0)
            System.out.println("NCR = " + ncr);
    }

    public static long ncr(int n, int r){

        if (n >= 0 && n < 21 && r >= 0 && r < 21){ 
            return factorial(n) / (factorial(r) * factorial(n-r));
        } else if (n < 0 || r < 0){
            System.out.println("Error: negative input");
            return -1;
        } else{
            System.out.println("Error: out of bounds");
            return -1;
        }        
    }

    public static long factorial(int i){
        
        if (i == 0) {
            return 1;
        } else {
            long fct = 1;
            for ( int j = 1; j <= i; j++ )
            fct *= j;
            return fct;
        }
    }
}