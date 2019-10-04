import java.util.*;

public class 2d{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);
Random rand = new Random();

double x = 0;
double y = 0;

System.out.println("Enter number of iterations:");
int iteration = scan.nextInt();

for (int i = 1; i <= iteration; i++){
    x = x + rand.nextDouble(2) - 1;
    y = y + rand.nextDouble(2) - 1;
}

System.out.println("Position: (" + x + ", " + y + ")");
System.out.println("Distance from origin: " + Math.sqrt(x*x + y*y));


    }
    }