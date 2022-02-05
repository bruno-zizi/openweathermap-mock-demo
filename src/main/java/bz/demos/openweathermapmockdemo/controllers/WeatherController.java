package bz.demos.openweathermapmockdemo.controllers;


import bz.demos.openweathermapmockdemo.forecast.ForecastData;
import bz.demos.openweathermapmockdemo.model.weather.WeatherData;
import bz.demos.openweathermapmockdemo.services.feign_clients.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping(value = "/current")
    public WeatherData getCurrentWeather(){
        return weatherService.getCurrenWeather();
    }

    @GetMapping(value = "/forecast")
    public ForecastData getForecast(){
        return weatherService.getForecast();
    }
}
