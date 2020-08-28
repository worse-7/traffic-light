package com.worst.traffic;

public class RedTrafficLight implements ITrafficLight {
    @Override
    public void change(TrafficLight trafficLight) {
        trafficLight.setState(new YellowTrafficLight());
    }

    @Override
    public void getState() {
        System.out.println("State is Red");
    }
}
