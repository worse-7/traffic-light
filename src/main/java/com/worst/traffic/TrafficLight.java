package com.worst.traffic;

public class TrafficLight {
    private ITrafficLight state;

    public void setState(ITrafficLight state) {
        this.state = state;
    }

    TrafficLight() {
        state = new RedTrafficLight();
    }
    public void changeState() {
        state.change(this);
    }

    public void getCurrentState() {
        state.getState();
    }
}
