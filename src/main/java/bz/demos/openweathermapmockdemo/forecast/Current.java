
package bz.demos.openweathermapmockdemo.forecast;

import java.util.ArrayList;
import java.util.List;


public class Current {

    public Integer dt;
    public Integer sunrise;
    public Integer sunset;
    public Double temp;
    public Double feelsLike;
    public Integer pressure;
    public Integer humidity;
    public Double dewPoint;
    public Double uvi;
    public Integer clouds;
    public Integer visibility;
    public Double windSpeed;
    public Integer windDeg;
    public Double windGust;
    public List<Weather> weather = new ArrayList<Weather>();

}
