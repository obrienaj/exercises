import java.util.Scanner;

public class Euler{
    public static void main (String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter x:");
int x = scan.nextInt();

int count = 1;
double denominator = 42;
double numerator = 1;
double term = 42;
double sum = 1;

while (Math.abs(term) < 1.0E-12){
    denominator = count*count;
    numerator = numerator*x;
    term = (numerator)/(count*denominator);
    sum = sum + term;
    count++;
}
System.out.println("Calculated e^x: " + sum);


    }

}