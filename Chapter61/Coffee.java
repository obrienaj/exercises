import java.io.*;
import java.util.Scanner;

public class Coffee{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("How many coffees tested?");
        final int x = scan.nextInt();

        double[] ph = new double[x];
        double sum = 0;

        for (int j = 0; j < x; j++){
            
            System.out.print("pH[" + j + "] = ");
            ph[j] = scan.nextDouble();
            sum += ph[j];    
        }

        double avg1 = sum / x;
        double trash = ph[0];

        System.out.println("Average pH: " + avg1);

        for (int j = 1; j < x; j++){

            if (Math.abs(avg1 - ph[j]) > Math.abs(avg1 - trash))
                trash = ph[j];
        }

        System.out.println("Most distant value: " + trash);

        double avg2 = (sum - trash) / (x - 1);

        System.out.println("New average pH: " + avg2);
        
    }
}