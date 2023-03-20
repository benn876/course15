package homework.temperatureConvertor;

public class TemperatureConvertor {
    public static double convertFahrenheitToCelsius(double convert) {
        return (convert - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double convert) {
        return convert * 9/5 + 32;
    }
}
