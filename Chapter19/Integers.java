import java.util.Scanner;

public class Integers{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter starting value:");
int start = scan.nextInt();

System.out.println("Enter ending value:");
int end = scan.nextInt();

int count = start;

while (count <= end) {
    System.out.println(count);
    count = count + 1;
}


    }

}