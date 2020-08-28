package com.worst.traffic;

public class YellowTrafficLight implements ITrafficLight {
    @Override
    public void change(TrafficLight trafficLight) {
        trafficLight.setState(new GreenTrafficLight());
    }

    @Override
    public void getState() {
        System.out.println("State is Yellow");
    }
}
