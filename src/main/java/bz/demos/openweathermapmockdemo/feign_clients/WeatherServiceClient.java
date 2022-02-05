package bz.demos.openweathermapmockdemo.feign_clients;

import bz.demos.openweathermapmockdemo.forecast.ForecastData;
import bz.demos.openweathermapmockdemo.model.weather.WeatherData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="WeatherServiceClient", url = "http://api.openweathermap.org/data/2.5/")
public interface WeatherServiceClient {

    /**
     * call to api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
     *
     * @param lat
     * @param lon
     * @return
     */
    @GetMapping(value = "/weather")
    WeatherData currentWeather(@RequestParam("lat") String lat, @RequestParam("lon") String lon, @RequestParam("appid") String apiKey);

    /**
     * call to api.openweathermap.org/data/2.5/onecall?lat={lat}&lon={lon}&appid={API key}
     *
     * @param lat
     * @param lon
     * @return
     */
    @GetMapping(value = "/onecall")
    ForecastData forecast(@RequestParam("lat") String lat, @RequestParam("lon") String lon, @RequestParam("appid") String apiKey);

}
