package Uber;

import java.util.concurrent.atomic.AtomicInteger;
import java.awt.Point;

public class Passenger {
    private String name;
    private String contactInfo;
    private UberMain uberMain;

    public Passenger(String name, String contactInfo, UberMain main){
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void requestRide(Point startLocation, Point destination, AtomicInteger rideId) {
        RideRequest rideRequest = new RideRequest(rideId, this, startLocation, destination, RideStatus.PENDING);
        uberMain.createRide(rideRequest);
    }

    public String makePayment() {
        System.out.println(this.name);
        return "DONE";
    }
}
