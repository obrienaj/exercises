import java.util.Scanner;

public class Cents{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int cents, dollars;

    System.out.println("Input cent value: ");
    cents = scan.nextInt();

    dollars = cents/100;
    cents = cents%100;

    System.out.println("That is " + dollars + " dollars and " + cents + " cents.");

    }



}