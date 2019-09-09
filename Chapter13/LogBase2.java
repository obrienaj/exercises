import java.util.*;

public class LogBase2{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number");
    double number = scan.nextDouble();

    double baseLog = (Math.log(number)/(Math.log(2)));

    System.out.println("The base 2 logarithm of " + number + " is " + baseLog);

    }

}