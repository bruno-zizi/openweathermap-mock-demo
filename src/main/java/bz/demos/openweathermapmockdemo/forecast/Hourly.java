
package bz.demos.openweathermapmockdemo.forecast;

import java.util.ArrayList;
import java.util.List;



public class Hourly {

    public Integer dt;
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
    public List<Forecast> weather = new ArrayList<Forecast>();
    public Double pop;
    public Rain rain;

}
