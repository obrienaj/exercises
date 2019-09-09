import java.util.Scanner;
import java.lang.Math;

public class WindChill{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter wind speed in mph:");
double speed = scan.nextInt();

System.out.println("Enter temperature in degrees F:");
double temp = scan.nextInt();

double chill;

if (speed < 3 || temp > 50)
    chill = temp;
else
    chill = 35.74 + 0.6215*temp - 35.75*(Math.pow(speed, .16)) + 0.4275*temp*(Math.pow(speed, .16));

System.out.println("Wind chill: " + chill);



}


}