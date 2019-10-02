import java.util.*;

public class GuessGame{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);
Random rand = new Random();
boolean correct = false;
int attempt = 1;
int response = 1;

int answer = rand.nextInt(10) + 1;

System.out.println("I am thinking of a number from 1 to 10.");
System.out.println("You must guess what it is in three tries.");

while (correct == false && attempt <= 3){
    System.out.println("Enter a guess:");
    response = scan.nextInt();
    if (response == answer)
        correct = true;
    else
        System.out.println("Wrong");
    attempt++;
}

if (response == answer)
    System.out.println("You win!");
else
    System.out.println("You lose!");
    System.out.println("I was thinking of the number " + answer + ".");



    }

}