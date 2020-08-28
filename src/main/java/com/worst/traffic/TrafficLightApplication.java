package com.worst.traffic;

public class TrafficLightApplication {


    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        while (true) {
            trafficLight.changeState();
            trafficLight.getCurrentState();
        }
    }
}
