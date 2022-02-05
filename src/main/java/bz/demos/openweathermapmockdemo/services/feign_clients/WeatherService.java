package bz.demos.openweathermapmockdemo.services.feign_clients;

import bz.demos.openweathermapmockdemo.feign_clients.WeatherServiceClient;
import bz.demos.openweathermapmockdemo.forecast.ForecastData;
import bz.demos.openweathermapmockdemo.model.weather.WeatherData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WeatherService {

    @Value("${weather.apiKey}")
    String apiKey;

    @Value("${weather.latitude}")
    String latitude;

    @Value("${weather.longitude}")
    String longitude;

    @Autowired
    WeatherServiceClient weatherServiceClient;

    public WeatherData getCurrenWeather(){
        log.info("Asking current weather to provider for coordinates [lat = {}, lon = {}]",latitude, longitude);
        return weatherServiceClient.currentWeather(latitude, longitude, apiKey);
    }


    public ForecastData getForecast(){
        log.info("Asking current weather to provider for coordinates [lat = {}, lon = {}]",latitude, longitude);
        return weatherServiceClient.forecast(latitude, longitude, apiKey);
    }
}
