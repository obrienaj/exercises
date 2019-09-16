import java.util.Scanner;

public class Power{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter X:");
double x = scan.nextDouble();

System.out.println("Enter n:");
int n = scan.nextInt();

if (n < 0)
    System.out.println("N must be a positive integer");
else {

double power = 1;
int count = 1;

while (count <= n){
    power = power * x;
    count++;
}

System.out.println(x + " raised to the power of " + n + " is " + power);


}


    }


}