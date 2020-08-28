package com.worst.traffic;

public class YellowTrafficLight implements ITrafficLight {

    YellowTrafficLight(long delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void change(TrafficLight trafficLight) {
        trafficLight.setState(new GreenTrafficLight(2000l));
    }

    @Override
    public void getState() {
        System.out.println("State is Yellow");
    }
}
