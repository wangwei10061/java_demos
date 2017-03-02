package designpattern.observer;

/**
 * Created by wangw on 2016/3/27.
 */
public interface Subject {
    void registerObserver(Object o);
    void removeObserver(Object o);
    void notifyObservers();
}
