package Uber;

import java.util.concurrent.atomic.AtomicInteger;
import java.awt.Point;

public class RideRequest {
    private AtomicInteger Id;
    private Passenger passenger;
    private Point startLocation;
    private Point destination;
    private RideStatus status;

    public RideRequest(AtomicInteger id, Passenger passenger, Point start, Point destination, RideStatus status) {
        this.Id = id;
        this.passenger = passenger;
        this.startLocation = start;
        this.destination = destination;
        this.status = status;
    }

    public Point getStartLocation() {
        return this.startLocation;
    }

    public Point getDestination() {
        return this.destination;
    }

    public AtomicInteger getrideId() {
        return this.Id;
    }

    public Passenger getRequestedPassenger() {
        return this.passenger;
    }
}
