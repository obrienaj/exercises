import java.io.* ;
import java.lang.Math;

class Zero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    
    int closest = data[0];

    // find the element nearest to zero
    for (int index = 0; index < 9 ; index++)
    {
        if (Math.abs(data[index]) < Math.abs(closest)){
            closest = data[index];
        }
    }
      
    // write out the element nearest to zero
    System.out.println("Closest to zero: " + closest);

  }
} 