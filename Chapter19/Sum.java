import java.util.Scanner;

public class Sum{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter N:");
int n = scan.nextInt();

int sum = 0;
int count = 1;

while (count <= n) {
    sum = sum + count;
    count = count +1;
}

System.out.println("Loop sum = " + sum);

sum = (n*(n+1)) / 2;
System.out.println("Formula sum = " + sum);


    }

}