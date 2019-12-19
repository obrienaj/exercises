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
    public String getNam()
    {
        return GeoLocation.getName();
    }

    // Abilities
    public String toString()
    {
        return "The average temperature in " + getNam() + " is " + getTemp();
        // name is stored in GeoLocation, which is a component of WeatherInfo. How do I get it?
    }
}