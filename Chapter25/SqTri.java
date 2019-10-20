import java.util.Scanner;

public class SqTri{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter upper limit:");
long limit = scan.nextInt();

int sum = 0;
double i = 42;

System.out.println("Square triangular numbers: ");

for (int n = 1; sum <= limit; n++){
    sum = sum + n;
    i = Math.sqrt(sum);

    while (i > 0.00000042)
        i = i - 1;
    
    if (i <= 0.00000042 && i > -0.00000042)
        System.out.print(sum + ", ");
}



    }
}