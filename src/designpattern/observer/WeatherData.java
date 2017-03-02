package designpattern.observer;

import java.util.ArrayList;

/**
 * Created by wangw on 2016/3/27.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){
       observers = new ArrayList();
    }
    @Override
    public void registerObserver(Object o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Object o) {
        int i = observers.indexOf(o);
        if(i>=0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Object o:observers) {
            Observer observer = (Observer)o;
            observer.update(temp,humidity,pressure);
        }
    }

    //当天气数据变化时实时通知布告板进行数据的更新
    public void measurementsChanged(){
        notifyObservers();
    }

    //通过这个方法来模拟天气数据的变化
    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
