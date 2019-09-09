import java.util.Scanner;
public class Delicatessen{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter item name:");
String item = scan.nextLine();

System.out.println("Enter item price in cents:");
int price = scan.nextInt();

int delivery = 42;

if (price < 1000)
    delivery = 200;

if (price >= 1000)
    delivery = 0;

System.out.println("Express delivery? (0=no, 1=yes)");
int express = scan.nextInt();

if (express == 1)
    delivery = delivery + 300;

int total = price + delivery;

System.out.println("Invoice:");
System.out.println("    " + item + "    " + price);
System.out.println("    Delivery    " + delivery);
System.out.println("    Total   " + total);



    }


}