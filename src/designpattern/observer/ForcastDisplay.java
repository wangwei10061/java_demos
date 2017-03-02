package designpattern.observer;

/**
 * Created by wangw on 2016/3/27.
 * 预告布告板，待实现
 */
public class ForcastDisplay implements Observer,DisplayElement {
    private Subject weatherData;
    public ForcastDisplay()
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
