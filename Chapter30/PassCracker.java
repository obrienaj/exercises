import java.util.*;

public class PassCracker{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);
Random rand = new Random();

System.out.println("Enter a secret password, 3 characters or less:");
String pass = scan.nextLine();

boolean match;
match = false;
int attempt = 1;
int i = 0;
String guess = "";
int length = 0;
String choices = "abcdefghijklmnopqrstuvwxyz";
choices = choices + choices.toUpperCase();
choices = choices + "0123456789";

while (!match){
    length = rand.nextInt(3) + 1;
    
    while (i < length){
        guess = guess + choices.charAt(rand.nextInt(choices.length()));
        i++;
    }

    System.out.println(guess);

    if (guess.equals(pass))
        match = true;
    else
        guess = "";
    i = 0;

    attempt++;
}

System.out.println("Here is your password: " + guess);
System.out.println("It took " + attempt + " tries to guess it.");


    }

}