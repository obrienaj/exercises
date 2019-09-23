import java.util.Scanner;

public class Euler{
    public static void main (String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter x:");
double x = scan.nextInt();

double sum = 0;
double term = 1;
double n = 1;

while (Math.abs(term) > 1E-12){
    sum = sum + term;
    term = term * (x/n);
    n = n + 1;
}

double fake = Math.exp(x);

System.out.println("Calculated e^x: " + sum);
System.out.println("Real e^x: " + fake);

    }

}