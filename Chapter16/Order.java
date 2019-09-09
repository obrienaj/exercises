import java.util.Scanner;

public class Order{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter quantity of bolts:");
int bolts = scan.nextInt();

System.out.println("Enter quantity of nuts:");
int nuts = scan.nextInt();

System.out.println("Enter quantity of washers:");
int washers = scan.nextInt();

if (nuts >= bolts)
    System.out.println("Check order: too few nuts");
    
if (washers >= 2*bolts)
    System.out.println("Check order: too few washers");

int price = 5*bolts + 3*nuts + washers;
System.out.println("Price: " + price);

}
}