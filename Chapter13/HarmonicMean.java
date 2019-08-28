import java.util.*;

public class HarmonicMean{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter X: ");
    double X = scan.nextDouble();

    System.out.println("Enter Y: ");
    double Y = scan.nextDouble();

    double mean = (X + Y)/2;
    double hMean = 2/( (1/X) + (1/Y) );

    System.out.println("Arithmetic mean: " + mean);
    System.out.println("Harmonic mean: " + hMean);




    }






}