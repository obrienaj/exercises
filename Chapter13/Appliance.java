import java.util.Scanner;

public class Appliance{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter cost per kilowatt-hour in cents ");
    double rate = scan.nextDouble();

    System.out.println("Enter kilowatt-hours used per year ");
    double hours = scan.nextDouble();

    System.out.println("Annual cost: $" + (rate*hours)/100);


    }



}