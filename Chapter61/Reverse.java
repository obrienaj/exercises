import java.io.* ;

class Reverse
{
    public static void main ( String[] args ) 
    {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int temp;

    // reverse the data
    for ( int j=0; j < data.length / 2; j++)
    {
        temp = data[j];
        data[j] = data[data.length - j - 1];
        data[data.length - j - 1] = temp;
    }
      
    // write out the new data
    for ( int j=0; j < data.length; j++)
    {
        System.out.print(data[j] + " ");
    }

  }
}      
