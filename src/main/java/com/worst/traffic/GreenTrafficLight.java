package com.worst.traffic;

public class GreenTrafficLight implements ITrafficLight {


    GreenTrafficLight(long delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void change(TrafficLight trafficLight) {
        trafficLight.setState(new RedTrafficLight(1000l));

    }

    @Override
    public void getState() {
        System.out.println("State is Green");
    }
}
