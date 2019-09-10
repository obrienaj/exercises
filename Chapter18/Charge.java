import java.util.Scanner;

public class Charge{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter checking account balance:");
double checking = scan.nextInt();

System.out.println("Enter savings account balance:");
double savings = scan.nextInt();

double charge;

if (checking > 1000 || savings > 1500)
    charge = 0;
else {
    System.out.println("Enter number of checks:");
    double checks = scan.nextInt();
    charge = .15*checks;
}
System.out.println("Service charge is $" + charge);

    }


}