import java.util.*;

public class Gas{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter capacity of gas tank, in gallons:");
double capacity = scan.nextInt();

System.out.println("Enter indication of the gas gauge, in percent:");
double percentFull = scan.nextInt();

System.out.println("Enter mpg of vehicle:");
double mpg = scan.nextInt();

double initialGas = capacity*percentFull / 100;
double gasNeeded = 200/mpg;

if (initialGas < gasNeeded)
    System.out.println("Get gas!");
else
    System.out.println("Safe to proceed");



    }

}