import java.util.*;

public class SqrtGame{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);
Random rand = new Random();

System.out.println("How many rounds?");
int rounds = scan.nextInt();

System.out.println("Player 1, sign in -->");
String p1 = scan.nextLine();

System.out.println("Player 2, sign in -->");
String p2 = scan.nextLine();

double guess1 = 0;
double guess2 = 0;
double answer = 42;
double close1 = 42;
double close2 = 42;
int wins1 = 0;
int wins2 = 0;

for (int i = 1; i <= rounds; i++){
    double num = 99*rand.nextDouble() + 1;
    System.out.println("What is the square root of " + num + "?");
    
    if (i/2 == 0){
        System.out.println(p1 + ", your guess: ");
        guess1 = scan.nextDouble();
        System.out.println(p2 + ", your guess: ");
        guess2 = scan.nextDouble();}
    else{
        System.out.println(p2 + ", your guess: ");
        guess2 = scan.nextDouble();
        System.out.println(p1 + ", your guess: ");
        guess1 = scan.nextDouble();}

    answer = Math.sqrt(num);
    close1 = Math.abs(guess1 - num);
    close2 = Math.abs(guess2 - num);

    System.out.println("Correct square root: " + answer);
    System.out.println(p1 + " was " + close1 + " away");
    System.out.println(p2 + " was " + close2 + " away");

    if (close1 < close2){
        System.out.println(p1 + " wins!");
        wins1 = wins1 + 1;}
    else{
        System.out.println(p2 + " wins!");
        wins2 = wins2 + 1;}    
}

System.out.println("----- Final score -----");
System.out.println(p1 + ": " + wins1 + "        " + p2 + ": " + wins2);



    }

}