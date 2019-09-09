import java.util.Scanner;

public class Cents{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int cents, dollars, quarters, dimes, nickels, pennies;

    System.out.println("Input cent value: ");
    cents = scan.nextInt();

    dollars = cents/100;
    quarters = (cents - 100*dollars)/25;
    dimes = (cents - 100*dollars - 25*quarters)/10;
    nickels = (cents - 100*dollars - 25*quarters - 10*dimes)/5;
    pennies = cents - 100*dollars - 25*quarters - 10*dimes - 5*nickels;

    System.out.println("Change due: " + cents + " cents, or " + 
    dollars + " dollars, " + quarters + " quarters, " + 
    dimes + " dimes, " + 
    nickels + " nickels, and " + 
    pennies + " pennies");

    }



}