import java.util.*;

public class Pie{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter weight in pounds:");
int weight = scan.nextInt();

if (weight >= 220 && weight <= 280)
    System.out.println("Weight allowed");
else
    System.out.println("Out of acceptable weight range");



}


}