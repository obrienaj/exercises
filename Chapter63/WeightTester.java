public class WeightTester
{
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight( values );
    System.out.println( june );

    int avg = june.average();
    System.out.println("average = " + avg);

    int avg1st = june.subAverage(1, 15);
    System.out.println("average, 1st half of June = " + avg1st);

    int avg2nd = june.subAverage(16, 30);
    System.out.println("average, 2nd half of June = " + avg2nd);

    System.out.println("difference in averages = " + Math.abs(avg1st - avg2nd));
  }
}      