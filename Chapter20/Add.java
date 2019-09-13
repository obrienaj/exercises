import java.util.Scanner;

public class Add{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("How many integers will be added?");
int terms = scan.nextInt();

int count = 1;
int integer = 0;
int sum = 0;

while (count <= terms) {
    System.out.println("Enter an integer:");
    integer = scan.nextInt();
    sum = sum + integer;
    count++ ;
}

System.out.println("The sum is " + sum);

    }


}