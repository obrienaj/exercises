import java.util.Arrays;

class Equality
{
  public static boolean myEquals( int[] a, int[] b )
  {
      int j = 0;
      boolean match = true;

      if (a.length != b.length)
        return false;

      while (match && j < a.length){

        if (a[j] == b[j])
            match = true;
        else
            match = false;
            return false;

        j++;
      }
      return true;
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };

    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayE, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( myEquals( arrayE, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      
  }
}