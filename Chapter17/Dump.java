import java.util.Scanner;

public class Dump{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter trash weight:");
double weight = scan.nextInt();

double cost;

if (weight <= 200)
    cost = weight*.1; 
else
    cost = 20 + .08*(weight - 200);

System.out.println("Cost: " + cost);



    }


}