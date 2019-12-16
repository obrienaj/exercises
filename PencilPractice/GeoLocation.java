public class GeoLocation
{
    // Class variables
    private double latitude = 0;
    private double longitude = 0;
    private String name = "";

    // Constructor
    public GeoLocation(double latitude, double longitude, String name)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    // Getters and setters
    public double getLat()
    {
        return latitude;
    }
    public double getLong()
    {
        return longitude;
    }
    public String getName()
    {
        return name;
    }
    public void setLatitude(double lat)
    {
        latitude = lat;
    }
    public void setLongitude(double lon)
    {
        longitude = lon;
    }
    public void setName(String nam)
    {
        name = nam;
    }

    // Abilities
    public double distance(GeoLocation ptA, GeoLocation ptB)
    {
        double a, c, d;
        final double r = 6371;

        a = pow(Math.sin((ptA.getLat() - ptB.getLat()) / 2), 2)
            + Math.cos(ptA.getLat()) * Math.cos(ptB.getLat()) * pow(Math.sin((ptA.getLong() - ptB.getLong()) / 2), 2);
        
        c = 2 * atan2(sqrt(a), sqrt(1 - a));
        
        d = r * c;

        return d;
    }

    public boolean prox(GeoLocation ptA, GeoLocation ptB, double radius)
    {
        if (distance(ptA, ptB) <= radius)
            return true;
        else
            return false;
    }
}