package designpattern.observer;

/**
 * Created by wangw on 2016/3/27.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsObserver = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
//        ForcastDisplay forcastDisplay = new ForcastDisplay();

        weatherData.setMeasurements(8.0f,80,12);
        weatherData.setMeasurements(8.1f,79,11);
        weatherData.setMeasurements(8.2f,81,12);
    }
}
