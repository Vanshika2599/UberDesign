package Uber.Strategy;

import java.util.List;

import Uber.Driver;
import Uber.RideRequest;

public interface DriverAllocationStrategy {

    public List<Driver> getAvailableDrivers(RideRequest rideRequest);
      
}
