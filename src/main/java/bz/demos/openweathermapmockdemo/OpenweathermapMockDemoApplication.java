package bz.demos.openweathermapmockdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class OpenweathermapMockDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenweathermapMockDemoApplication.class, args);
    }

}
