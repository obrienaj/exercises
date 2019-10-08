import java.util.*;

public class Pig{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);
Random rand = new Random();

int rollP = 0;
int rollC = 0;

int sumP = 0;
int sumC = 0;

int scoreP = 0;
int scoreC = 0;
int i = 1;

int response = 1;
boolean again = true;

while (scoreP < 100 && scoreC < 100){

    sumC = 0;
    sumP = 0;
    i = 1;
    again = true;

    while (i < 4 && again){
        rollC = rand.nextInt(6) + 1;
        System.out.println("Computer rolled a " + rollC);
        
        if (rollC == 1){
            System.out.println("Computer's turn has ended.");
            sumC = 0;
            again = false;
        }
        else{
            sumC = sumC + rollC;
            again = true;
            i++;
        }
    }

    scoreC = scoreC + sumC;
    again = true;
    System.out.println("");

    while (again){
        rollP = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + rollP);
        
        if (rollP == 1){
            System.out.println("Your turn has ended.");
            sumP = 0;
            again = false;
        }
        else{
            sumP = sumP + rollP;
            System.out.println("Roll again? (0 or 1)");
            response = scan.nextInt();
            if (response == 1)
                again = true;
            else
                again = false;
        }

        System.out.println("");
    }
    
    scoreP = scoreP + sumP;

}

if (scoreC >= 100)
    System.out.println("Computer wins :(");
else
    System.out.println("You win!");

System.out.println("Final score:    Computer- " + scoreC + "    Player- " + scoreP);

    }

}