import java.util.Scanner;

public class SignUp{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("welcome 2 my website :)");
    System.out.println("Enter username:");

    String username = scan.nextLine();

    if (username.equals("jimbob234") || username.equals("admin") || username.equals("gary") || username.equals("skater_gurl"))
        System.out.println("Username taken");
    else {
        System.out.println("Enter password:");
        String password = scan.nextLine();

        String firstLetter = password.substring(0,1);

        if (!firstLetter.equals("a") && !firstLetter.equals("e") && !firstLetter.equals("i") && !firstLetter.equals("o") && !firstLetter.equals("u") && !firstLetter.equals("y"))
            System.out.println("Password must start with a vowel");
        else {

            if (password.contains(username))
                System.out.println("Password cannot include username");
            else {

                if (!password.contains("#") && !password.contains("!") && !password.contains("$") && !password.contains("&"))
                    System.out.println("Password must include #, !, $, or &");
                else {

                    int passwordLength = password.length();
                    String firstPart = password.substring(0, passwordLength - 2);

                    if (firstPart.contains("0") || firstPart.contains("1") || firstPart.contains("2") || firstPart.contains("3") || firstPart.contains("4") || firstPart.contains("5") || firstPart.contains("6") || firstPart.contains("7") || firstPart.contains("8") || firstPart.contains("9"))
                        System.out.println("Numbers may only be in the last two places");
                    else
                        System.out.println("Username and password set");


                }


            }



        }

 


        }
    }



}