
package bz.demos.openweathermapmockdemo.forecast;

import java.util.ArrayList;
import java.util.List;



public class ForecastData {

    public Double lat;
    public Double lon;
    public String timezone;
    public Integer timezoneOffset;
    public Current current;
    public List<Minutely> minutely = new ArrayList<Minutely>();
    public List<Hourly> hourly = new ArrayList<Hourly>();
    public List<Daily> daily = new ArrayList<Daily>();

}
