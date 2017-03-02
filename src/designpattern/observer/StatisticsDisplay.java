package designpattern.observer;

/**
 * Created by wangw on 2016/3/27.
 * 数据统计布告板，待实现
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    private Subject weatherData;
    public StatisticsDisplay()
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
