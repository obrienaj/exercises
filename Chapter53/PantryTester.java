import java.util.Scanner;

public class PantryTester
{
  public static void main ( String[] args )
  {
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    System.out.println("Welcome to Mother Hubbard's Pantry!");
    System.out.println();
    System.out.println("The jams are:");

    Pantry hubbard = new Pantry(goose, apple, rhub);
    System.out.println(hubbard);

    Scanner scan = new Scanner(System.in);
    int choice = 1;
    int quantity = 1;

    while (choice == 1 || choice == 2 || choice == 3){

        System.out.println("Enter your selection (1, 2, or 3):");
        choice = scan.nextInt();
        
        if (choice != 1 && choice != 2 && choice != 3){
            
            if (choice == -1)
                System.out.println("See you soon!");

            else
                System.out.println("Out of bounds");
        }
        
        else{
            System.out.println("Enter amount to spread:");
            quantity = scan.nextInt();

            hubbard.select(choice);
            hubbard.spread(quantity);
            System.out.println(hubbard);
        }
    }
  
  }

}