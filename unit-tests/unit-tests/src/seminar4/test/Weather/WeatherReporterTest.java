package Weather;

import org.junit.jupiter.api.Test;
import seminar4.Weather.WeatherReporter;
import seminar4.Weather.WeatherService;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class WeatherReporterTest {

    @Test
    void testWeatherReporter(){
        WeatherService weatherService = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        when(weatherService.getCurrentTemperature()).thenReturn(10);
        String temp = weatherReporter.generateReport();
        assertThat(temp).isEqualTo("Текущая температура: " + 10 + " градусов.");
        verify(weatherService,times(1)).getCurrentTemperature();
    }



}
