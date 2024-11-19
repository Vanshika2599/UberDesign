package Uber.Strategy.Impl;

import Uber.RideRequest;
import Uber.Strategy.FareCalculationStrategy;
import java.awt.Point;

public class DefaultFareCalculation implements FareCalculationStrategy {
    
    private Double farePerKm = 5.00;

    @Override
    public Double calculateFare(RideRequest request){
        Point start = request.getStartLocation();
        Point dest = request.getDestination();
        return (Math.abs(start.getX()-dest.getX()))+ (Math.abs(start.getY()- dest.getY())) * farePerKm;
    }

}
