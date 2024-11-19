package Uber.Strategy;

import Uber.RideRequest;

public interface FareCalculationStrategy {
    Double calculateFare(RideRequest rideRequestRequest);
}
