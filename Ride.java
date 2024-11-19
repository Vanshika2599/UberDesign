package Uber;

import java.awt.Point;
import java.util.concurrent.atomic.AtomicInteger;

public class Ride {
    private Double fare;
    private Point startLocation;
    private Point destination;
    private String Status;
    private AtomicInteger rideId;
    private Driver driver;
    private Passenger passenger;

    public Ride(Double fare, Point start, Point end, AtomicInteger rideId) {   
        this.fare = fare;
        this.startLocation = start;
        this.destination= end;
        this.Status = "INITIATED";
        this.rideId = rideId;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Double getFare() {
        return this.fare;
    }

    public Passenger getPassenger(){
        return this.passenger;
    }

}