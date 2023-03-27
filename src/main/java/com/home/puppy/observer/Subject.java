package com.home.puppy.observer;

/**
 * Subject
 *
 * @author hexiaogou
 * @desc interface subject
 * @date 2023-03-27 19:56
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserverList();
}
