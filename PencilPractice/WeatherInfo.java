public class WeatherInfo
{
    // Class variables
    GeoLocation geo;
    private int temp;

    // Constructor
    public WeatherInfo(GeoLocation geo, int temp)
    {
        this.geo = geo;
        this.temp = temp;
    }

    // Getters and Setters
    public int getTemp()
    {
        return temp;
    }
}