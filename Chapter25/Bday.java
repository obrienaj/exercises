import java.util.Scanner;

public class Bday{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("How many guests are present?");
int guests = scan.nextInt();

double chance = 1;

for (int n = 1; n <= guests; n++)
    chance = chance * ((365.0 - (n-1)) / 365.0);

System.out.println("Probability of a shared birthday: " + (1.0 - chance)*100 + "%");

double chance2 = 1;
int answer = 42;

for (int n = 1; chance2 >= .5; n++){
    chance2 = chance2 * ((365.0 - (n-1)) / 365.0);
    answer = n;
}
System.out.println("In a party with " + answer + " guests, there is a " + (1.0 - chance2)*100 + "% chance of at least one shared birthday.");

    }
}