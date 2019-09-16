import java.util.Scanner;
import java.util.Random;

public class MultQuiz{
    public static void main (String[] args){

Scanner scan = new Scanner(System.in);

Random random = new Random();

int count = 1;
int x, y, product, response;
int correct = 0;

while (count <= 10){
    x = random.nextInt(10);
    y = random.nextInt(10);
    product = x*y;
    System.out.println("What is " + x + " * " + y + "?");
    response = scan.nextInt();
    
    if (response == product){
        System.out.println("Right!");
        correct = correct + 1;
        }
    else
        System.out.println("Wrong. " + x + " * " + y + " is " + product);

    count++;
}

System.out.println("You got " + correct + " out of 10 questions correct!");



    }


}