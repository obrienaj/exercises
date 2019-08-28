import java.util.Scanner;

public class SubstringFun{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Type string: ");
    String original = scan.nextLine();

    System.out.println("Enter beginning index: ");
    int beginIndex = scan.nextInt();

    System.out.println("Enter ending index: ");
    int endIndex = scan.nextInt();

    String cut = original.substring(beginIndex, endIndex);
    System.out.println(original);
    System.out.println(cut);


    }



}