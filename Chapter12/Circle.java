  import java.util.Scanner;
  
  public class Circle{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int radius;
    double area;

    System.out.println("Enter radius: ");
    radius = scan.nextInt();

    area = Math.PI * radius * radius ;

    System.out.println("The radius is: " + radius + " The area is: " + area);
    }


}