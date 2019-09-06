import java.util.Scanner;

public class Discount{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter cost of purchases in cents:");
int cost = scan.nextInt();

int finalCost;

if (cost > 1000)
    finalCost =  (cost)/10*9;
else 
    finalCost = cost;

System.out.println("Discounted price: " + finalCost);


    }



}