package com.worst.traffic;

public class RedTrafficLight implements ITrafficLight {

    RedTrafficLight(long delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void change(TrafficLight trafficLight) {
        trafficLight.setState(new YellowTrafficLight(500l));
    }

    @Override
    public void getState() {
        System.out.println("State is Red");
    }
}
