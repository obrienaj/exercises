import java.util.Scanner;

public class OddInts{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter integer:");
int n = scan.nextInt();

int sum = 0;
int count;

for (count = 1; count <= n; count += 2)
    sum = sum + count;

int square = n*n;

System.out.println("Sum of all odd integers from 1 to N: " + sum);
System.out.println("Square: " + square);




    }

}