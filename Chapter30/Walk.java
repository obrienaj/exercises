import java.util.*;

public class Walk{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);
Random rand = new Random();

double x = 0;
double y = 0;

System.out.println("Enter number of iterations:");
int iteration = scan.nextInt();

for (int i = 1; i <= iteration; i++){
    x = x + 2*rand.nextDouble() - 1;
    y = y + rand.nextDouble() - 1;
}

System.out.println("Position: (" + x + ", " + y + ")");
System.out.println("Distance from origin: " + Math.sqrt(x*x + y*y));


    }
    }