import java.util.Scanner;

public class Harmonic{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter N:");
int n = scan.nextInt();

int count = 1;
double sum = 0;

while (count <= n){
    sum = sum + 1.0/count;
    count++;
}

System.out.println("The sum is " + sum);

    }


}