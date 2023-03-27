package com.home.puppy.observer;

import org.junit.jupiter.api.Test;

/**
 * ObserverTest
 *
 * @author hexiaogou
 * @desc observer test
 * @date 2023-03-27 20:03
 */
public class ObserverTest {
    @Test
    public void observerPatternTest() {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(tvDisplay);

        weatherStation.setTemperature(75.0f);

        weatherStation.removeObserver(phoneDisplay);
        weatherStation.setTemperature(80.0f);
    }
}
