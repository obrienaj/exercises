class Weight
{
  private int[] data;
  
  // Constructor

  public Weight(int[] init)
  {
    // Make data the same length as the array referenced by init.
    data = new int[init.length + 1];
    
    // Copy values from the input data to data.
    for (int j = 0; j < 30; j++)
    {
      data[j + 1] = init[j];
    }
  }

  public int average()
  {
    int sum = 0;
    
    for (int j = 1; j < 31; j++){
      sum += data[j];
    }

    return sum / 30;

  }
  
  public int subAverage(int start, int end)
  {
    int sum = 0;
    int days = 0;

    for (int j = start; j <= end; j++){
      sum += data[j];
      days++;
    }

    return sum / days;
  }

  //Print
  public String toString()
  {
    String dataChart = "Day\tWeight";
    
    for (int j = 1; j < 31; j++)
      dataChart += "\n" + j + "\t" + data[j];
    
    return dataChart;
  }
}