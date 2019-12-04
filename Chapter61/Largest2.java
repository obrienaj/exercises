import java.io.* ;

class Largest2
{

  public static void main ( String[] args )  
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables for the two largest
    
    int largest = data[0];
    int second = data[1];
    
    // compute the two largest
    for ( int index = 0; index < data.length; index++)
    {
        if (data[index] > largest){
            second = largest;
            largest = data[index];
        }
        else if (data[index] > second)
            second = data[index];
    }
      
    // write out the two largest
    System.out.println("Largest: " + largest);
    System.out.println("Second largest: " + second);


  }
}   