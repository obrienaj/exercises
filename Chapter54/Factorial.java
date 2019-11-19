import java.util.Scanner;

public class Factorial
{
  public static void main (String[] args) 
  {
    System.out.println("Enter N:");
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    System.out.println( "factorial of " + N );

    if (N == 0) {
        System.out.println("1");
    } else if (N < 0) {
        System.out.println("Error: negative input");
    } else if (N > 20) {
        System.out.println("Error: out of bound");
    }    
    else{
        System.out.println( "second  method : " + factorialAlt( N ));
        System.out.println( "first method : " + factorial( N ) );         
    }    
  }  

  public static long factorial( int N )
  {
    long fct = 1;
    for ( int j=1; j<=N; j++ )
      fct *= j;
    return fct;
  }
  
  public static long factorialAlt( int N )
  {
    long fct = 1;
    while ( N>0 )
    {
      fct *= N;
      N-- ;
    }
    return fct;
  }
  

}
