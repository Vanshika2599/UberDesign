package Uber;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import Uber.Strategy.DriverAllocationStrategy;
import Uber.Strategy.FareCalculationStrategy;
import Uber.Strategy.Impl.AvailableDriverAllocation;
import Uber.Strategy.Impl.DefaultFareCalculation;

public class UberMain {

     private AtomicInteger rideId = new AtomicInteger(0);
      private FareCalculationStrategy fareCalculationStrategy;
      private DriverAllocationStrategy driverAllocationStrategy;

      public UberMain(DriverDatabase database){
        this.fareCalculationStrategy = new DefaultFareCalculation();
        this.driverAllocationStrategy = new AvailableDriverAllocation(database);
      }
      
      public void createRide(RideRequest rideRequest) {
          Double fare = fareCalculationStrategy.calculateFare(rideRequest);
          List<Driver> availableDrivers = driverAllocationStrategy.getAvailableDrivers(rideRequest);
          Ride ride = new Ride(fare, rideRequest.getStartLocation(), rideRequest.getDestination(), rideRequest.getrideId());
          for(Driver driver : availableDrivers) {
            if(driver.acceptOrDeclineRide(ride)) {
               ride.setDriver(driver);
               ride.setPassenger(rideRequest.getRequestedPassenger());
               driver.setOngoingRide(ride);
               break;
            }
          }    
      }
      
      public void notifyPassengerForPayment(Ride ride) {
        ride.getPassenger().makePayment();
      }

       public AtomicInteger getRidId() {
         return this.rideId;
       }

       public void incRideId() {
          rideId.incrementAndGet();
       }
}
