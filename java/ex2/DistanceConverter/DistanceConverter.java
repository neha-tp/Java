package DistanceConverter;

public class DistanceConverter
{
    public double meterToKM(double meter)
    {
        return meter/1000;
    }

    public double kmToMeter(double km)
    {
        return km*1000;
    }

    public double milesToKM(double miles)
    {
        return miles*1.609;
    }

    public double kmToMiles(double km)
    {
        return km/1.609;
    }
}