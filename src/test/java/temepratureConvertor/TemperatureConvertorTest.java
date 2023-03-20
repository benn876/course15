package temepratureConvertor;

import homework.temperatureConvertor.TemperatureConvertor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TemperatureConvertorTest {

    @Test
    void initClass() {
        TemperatureConvertor temperatureConvertor = new TemperatureConvertor();
    }

    @Test
    @DisplayName("WHEN calling the method THEN the test passes")
    void testCallConvertFahrenheitToCelsius() {
        TemperatureConvertor.convertFahrenheitToCelsius(160);
    }

    @Test
    @DisplayName("WHEN converting Fahrenheit to Celsius THEN the correct result is returned")
    void testConvertFahrenheitToCelsius() {
        double result = TemperatureConvertor.convertFahrenheitToCelsius(160);
        Assertions.assertThat(result).isEqualTo((double) (160 - 32) * 5 / 9);
    }

    @Test
    @DisplayName("WHEN calling the method THEN the test passes")
    void testCallConvertCelsiusToFahrenheit() {
        TemperatureConvertor.convertCelsiusToFahrenheit(160);
    }

    @Test
    @DisplayName("WHEN converting Celsius to FahrenheitTHEN the correct result is returned")
    void testConvertCelsiusToFahrenheit() {
        double result = TemperatureConvertor.convertCelsiusToFahrenheit(24);
        System.out.println(result);
        Assertions.assertThat(result).isEqualTo((double) 24 * 9 / 5 + 32);
    }
}
