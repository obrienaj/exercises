import java.util.Scanner;

public class Odious{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("To exit, enter a negative value.");
        System.out.println("Enter N:");
        int n = scan.nextInt();
        boolean odious;

        while (n >= 0){

            odious = odious(n)

            if (odious)
                System.out.println("N is odious.");
            else
                System.out.println("N is evil.");

            System.out.println("Enter N:");
            n = scan.nextInt();
            
        }

    }

    public static odious(n){

        j = n;
        sum = 0;

        while (j > 0){

            i = j % 2;
            sum = sum + i;

            j = j / 2;
        }
    }

}