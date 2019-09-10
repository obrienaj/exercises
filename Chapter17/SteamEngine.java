import java.util.Scanner;

public class SteamEngine{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter air temperature in degrees K:");
double tair = scan.nextInt();

System.out.println("Enter steam temperature in degrees K:");
double tsteam = scan.nextInt();

double max;

if (tsteam < 373)
    max = 0;
else
    max = 1 - tair/tsteam;

System.out.println("Maximum steam engine efficiency: " + max);




    }


}