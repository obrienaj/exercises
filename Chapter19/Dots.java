import java.util.Scanner;

public class Dots{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter first word:");
String first = scan.nextLine();

System.out.println("Enter second word:");
String second = scan.nextLine();

int length = first.length() + second.length();

String dots = ".";

while (length < 29) {
    dots = dots + ".";
    length = length + 1;
}

System.out.println(first + dots + second);

    }

}