package designpattern.observer;

/**
 * Created by wangw on 2016/3/27.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("现在的温湿度情况：");
        System.out.println(temp+"摄氏度,"+humidity+"的湿度值");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;

        display();
    }
}
