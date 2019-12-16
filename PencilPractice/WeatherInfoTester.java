public class WeatherInfoTester
{
    public static void main(String[] args)
    {
        WeatherInfo climate1 = new WeatherInfo(new GeoLocation(10, 42, "Allie Island"), 81);
        WeatherInfo climate2 = new WeatherInfo(new GeoLocation(42, 0, "Hell"), 2);        
    
        System.out.println("The average temperature in " + climate1.getName() + " is " + climate1.getTemp());
    }
}