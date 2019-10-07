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

String response = "";
boolean again = true;

while (scoreP < 100 && scoreC < 100){

sumC = 0;
sump = 0;

    for (int i = 1; i = 4; i++){
        rollC = rand.nextInt(6) + 1;
        System.out.println("Computer rolled a " + rollC);
        sumC = sumC + rollC;
    }

    while (again){
        rollP = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + rollP);
        
        if (rollP = 1){
            System.out.println("Your turn has ended.")
            sumP = 0;
        }
        else{
            sumP = sumP + rollP;

            System.out.println("Roll again? (yes/no)")
            response = scan.nextLine();
            if (response == "yes")
                again == true;
            else
                again == false;
        }

        scoreP = scoreP + sumP;
    }

}

if (scoreC >= 100)
    System.out.println("Computer wins :(");
else
    System.out.println("You win!");


    }

}