import java.util.Scanner;

public class Tax{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter annual income in dollars:");
double income = scan.nextInt();

double tax = 42;

if (income <= 15000)
    tax = 0;

if (income > 15000 && income <= 35000)
    tax = .1*(income-15000);

if (income > 35000 && income <= 65000)
    tax = 2000 + .16*(income-35000);

if (income > 65000 && income <= 105000)
    tax = 2000 + 4800 + .19*(income-65000);

if (income > 105000)
    tax = 2000 + 4800 + 7600 + .22*(income-105000);

System.out.println("Total price paid: $" + tax);

double percent = (tax*100)/income;
System.out.println(percent + "% of $" + income);


    }


}