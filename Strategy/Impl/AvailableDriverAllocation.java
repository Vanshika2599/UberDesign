package Uber.Strategy.Impl;

import java.util.ArrayList;
import java.util.List;

import Uber.Driver;
import Uber.DriverDatabase;
import Uber.RideRequest;
import Uber.Strategy.DriverAllocationStrategy;

public class AvailableDriverAllocation implements DriverAllocationStrategy {
    private DriverDatabase database;

    public AvailableDriverAllocation(DriverDatabase database) {
        this.database = database;
    }
    @Override
    public List<Driver> getAvailableDrivers(RideRequest request) {
      List<Driver> availableDrivers = new ArrayList<>();
      for(Driver driver : database.getAllDrivers()) {
          if(driver.getStatus() == "AVAILABLE") {
            availableDrivers.add(driver);
          }
      }
      return availableDrivers;
   }   
}
