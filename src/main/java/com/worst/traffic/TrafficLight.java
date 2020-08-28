package com.worst.traffic;

public class TrafficLight {
    private ITrafficLight state;

    public void setState(ITrafficLight state) {
        this.state = state;
    }

    TrafficLight(ITrafficLight trafficLight) {
        this.setState(trafficLight);
    }

    public void changeState() {
        state.change(this);
    }

    public void getCurrentState() {
        state.getState();
    }
}
