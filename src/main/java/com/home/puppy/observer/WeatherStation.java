package com.home.puppy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherStation
 *
 * @author hexiaogou
 * @desc weather station
 * @date 2023-03-27 19:59
 */
public class WeatherStation implements Subject {
    List<Observer> observerList;
    private float temperature;

    public WeatherStation() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserverList() {
        for (Observer observer : observerList) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserverList();
    }
}
