
package bz.demos.openweathermapmockdemo.model.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    public Coord coord;
    public List<Weather> weather = new ArrayList<Weather>();
    public String base;
    public Main main;
    public Integer visibility;
    public Wind wind;
    public Clouds clouds;
    public Integer dt;
    public Sys sys;
    public Integer timezone;
    public Integer id;
    public String name;
    public Integer cod;

}
