import java.util.*;

public class Farkle{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
Random rand = new Random();

System.out.println("Player 1: enter name");
String p1 = scan.nextLine();

System.out.println("Player 2: enter name");
String p2 = scan.nextLine();

int roll1 = 1;
int roll2 = 1;
String first = "";
String second = "";

while (roll1 == roll2){
    System.out.println("Who goes first?");
    roll1 = rand.nextInt(6) + 1;
    System.out.println(p1 + " rolled a " + roll1);
    roll2 = rand.nextInt(6) + 1;
    System.out.println(p2 + " rolled a " + roll2);
    if (roll1 == roll2){
        System.out.println("Roll again!")
    }
}
if (roll1 > roll2){
    first = p1;
    second = p2;
}
else{
    first = p2;
    second = p1;
}
System.out.println(first + " will go first.");

int score1 = 0;
int score2 = 0;
int d1, d2, d3, d4, d5, d6;
int keep1, keep2, keep3, keep4, keep5, keep6;
int sum1 = 0;
int sum2 = 0;
int remaining = 6;

while (score1 < 10000 && score2 < 10000){

    while (remaining > 0){
        System.out.println(first + ", roll your dice");

        d1 = rand.nextInt(6) + 1;
        System.out.println("Die 1: " + d1);
    
        if (remaining > 1){
            d2 = rand.nextInt(6) + 1;
            System.out.println("Die 2: " + d2);
        }
        if (remaining > 2){
            d3 = rand.nextInt(6) + 1;
            System.out.println("Die 3: " + d3);
        }
        if (remaining > 3){
            d4 = rand.nextInt(6) + 1;
            System.out.println("Die 4: " + d4);
        }
        if (remaining > 4){
            d5 = rand.nextInt(6) + 1;
            System.out.println("Die 5: " + d5);
        }

        if (remaining > 5){
            d6 = rand.nextInt(6) + 1;
            System.out.println("Die 6: " + d6);
        }
        
        System.out.println("Score die 1? (0/1)");
        keep1 = scan.nextInt();

        if (keep1 == 1){
                if (d1 == 1)
                    sum1 = sum1 + 100;               // ignoring the three-of-a-kind rule
                if (d1 == 5)
                    sum1 = sum1 + 50;
                remaining = remaining - 1;
                }

        if (remaining > 1){
            System.out.println("Score die 2? (0/1)");
            keep2 = scan.nextInt();
        
            if (keep2 == 1){
                if (d2 == 1)
                    sum1 = sum1 + 100;
                if (d2 == 5)
                    sum1 = sum1 + 50;
                remaining = remaining - 1;
            }
        }
        if (remaining > 2){
            System.out.println("Score die 3? (0/1)");
            keep3 = scan.nextInt();

            if (keep3 == 1){
                if (d3 == 1)
                    sum1 = sum1 + 100;
                if (d3 == 5)
                    sum1 = sum1 + 50;
                remaining = remaining - 1;
            }
        }
        if (remaining > 3){
            System.out.println("Score die 4? (0/1)");
            keep4 = scan.nextInt();

            if (keep4 == 1){
                if (d4 == 1)
                    sum1 = sum1 + 100;
                if (d4 == 5)
                    sum1 = sum1 + 50;
                remaining = remaining - 1;
            }
        }
        if (remaining > 4){
            System.out.println("Score die 5? (0/1)");
            keep5 = scan.nextInt();
            
            if (keep5 == 1){
                if (d5 == 1)
                    sum1 = sum1 + 100;
                if (d5 == 5)
                    sum1 = sum1 + 50;
                remaining = remaining - 1;
            }
        }
        if (remaining > 5){
            System.out.println("Score die 6? (0/1)");
            keep6 = scan.nextInt();

            if (keep6 == 1){
                if (d6 == 1)
                    sum1 = sum1 + 100;
                if (d6 == 5)
                    sum1 = sum1 + 50;
                remaining = remaining - 1;
            }
        }
    }
}
}
}