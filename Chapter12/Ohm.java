import java.util.Scanner;

public class Ohm{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    double voltage, current, resistance;

    System.out.println("Enter voltage: ");
    voltage = scan.nextInt();

    System.out.println("Enter resistance: ");
    resistance = scan.nextInt();

    current = (voltage + 0.0)/resistance;
    System.out.println("The current is " + current + " amps.");



    }



}
