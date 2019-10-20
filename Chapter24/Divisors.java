import java.util.Scanner;

public class Divisors{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter N:");
int N = scan.nextInt();

int sum = 0;

for (int i = 1; i <= N/2; i++){
    if (N % i == 0)
        sum = sum + i;
}

System.out.println("Sum of all factors of N on [1, N): " + sum);
if (N == sum)
    System.out.println("N is a perfect number.");





    }
}