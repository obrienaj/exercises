import java.util.Scanner;

public class Age{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter age");
System.out.println("Years:");
double years = scan.nextInt();

System.out.println("Months:");
double months = scan.nextInt();

System.out.println("Days:");
double days = scan.nextInt();

double monthsAvg = 42;

if (months == 0)
    monthsAvg = 0;

if (months == 1)
    monthsAvg = 31;

if (months == 2)
    monthsAvg = (31+28)/2;

if (months == 3)
    monthsAvg = (31+28+31)/3;

if (months == 4)
    monthsAvg = (31+28+31+30)/4;

if (months == 5)
    monthsAvg = (31+28+31+30+31)/5;

if (months == 6)
    monthsAvg = (31+28+31+30+31+30)/6;

if (months == 7)
    monthsAvg = (31+28+31+30+31+30+31)/7;

if (months == 8)
    monthsAvg = (31+28+31+30+31+30+31+31)/8;

if (months == 9)
    monthsAvg = (31+28+31+30+31+30+31+31+30)/9;

if (months == 10)
    monthsAvg = (31+28+31+30+31+30+31+31+30+31)/10;

if (months == 11)
    monthsAvg = (31+28+31+30+31+30+31+31+30+31+30)/11;

days = days + months*monthsAvg + years*365;

double seconds = days*24*60*60;

float average = 25000000;
double percent = seconds/average;

System.out.println("You have been alive for " + seconds + " seconds.");
System.out.println("That is " + percent + "% of the average human lifespan.");


}


}