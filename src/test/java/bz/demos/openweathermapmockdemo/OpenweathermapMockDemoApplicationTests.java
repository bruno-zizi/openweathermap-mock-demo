package bz.demos.openweathermapmockdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class OpenweathermapMockDemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testWeather() throws Exception {
        mockMvc.perform(
                get("/current").contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk());
    }

    @Test
    void testForecast() throws Exception {
        mockMvc.perform(
                        get("/forecast").contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk());
    }

}
