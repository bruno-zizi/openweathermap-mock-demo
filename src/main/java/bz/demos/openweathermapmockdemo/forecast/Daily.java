
package bz.demos.openweathermapmockdemo.forecast;

import java.util.ArrayList;
import java.util.List;



public class Daily {

    public Integer dt;
    public Integer sunrise;
    public Integer sunset;
    public Integer moonrise;
    public Integer moonset;
    public Double moonPhase;
    public Temp temp;
    public FeelsLike feelsLike;
    public Integer pressure;
    public Integer humidity;
    public Double dewPoint;
    public Double windSpeed;
    public Integer windDeg;
    public Double windGust;
    public List<Weather> weather = new ArrayList<Weather>();
    public Integer clouds;
    public Integer pop;
    public Integer uvi;
    public Double rain;

}
