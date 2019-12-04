import java.io.* ;

class Sums
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    
    int sum = 0;
    int sumOdd = 0;
    int sumEven = 0;
    
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
        sum += data[index];

        if (data[index] % 2 == 0)
            sumEven += data[index];
        else 
            sumOdd += data[index];
    }
      
    // write out the three sums
    System.out.println("Sum of all: " + sum + " Sum of evens: " + sumEven + " Sum of odds: " + sumOdd
    );

  }
}   