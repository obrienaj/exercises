import java.util.Scanner;

public class Mpg{
    public static void main (String[] args){

Scanner scan = new Scanner(System.in);

int milesI = 42;
int milesF, gallons;
float mpg;

while (milesI >= 0){

    System.out.println("Initial miles:");
    milesI = scan.nextInt();

    if (milesI < 0)
        System.out.println("Goodbye!");

    else {
    
    System.out.println("Final miles:");
    milesF = scan.nextInt();

    System.out.println("Gallons used:");
    gallons = scan.nextInt();

    mpg = (milesF - milesI) / gallons;
    System.out.println("Miles per gallon: " + mpg);

    System.out.println(" ");
}
}





    }


}