public class WeatherInfoTester
{
    public static void main(String[] args)
    {
        WeatherInfo climate1 = new WeatherInfo(new GeoLocation(10, 42, "Allie Island"), 81);
        WeatherInfo climate2 = new WeatherInfo(new GeoLocation(42, 0, "Hell"), 2);        
    
        System.out.println(climate1);
        System.out.println(climate2);
    }
}