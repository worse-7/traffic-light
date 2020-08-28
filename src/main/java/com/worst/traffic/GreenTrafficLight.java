package com.worst.traffic;

public class GreenTrafficLight implements ITrafficLight {
    @Override
    public void change(TrafficLight trafficLight) {
        trafficLight.setState(new RedTrafficLight());
    }

    @Override
    public void getState() {
        System.out.println("State is Green");
    }
}
