package ObserverPattern.one;

import ObserverPattern.one.impl.CurrentConditionsDisplay;
import ObserverPattern.one.impl.ForecastDisplay;
import ObserverPattern.one.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);

        new ForecastDisplay(weatherData);
        weatherData.setMeasurements(82, 66, 3.14f);
        weatherData.measurementsChanged();
    }
}
