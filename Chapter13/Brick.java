import java.util.Scanner;

public class Brick{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    double gravity = 32.174;

    System.out.println("Enter time in seconds");
    double seconds = scan.nextDouble();

    System.out.println("Distance: " + 0.5*gravity*(seconds*seconds) + " feet");



    }



}