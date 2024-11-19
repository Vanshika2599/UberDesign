package Uber;

import java.awt.Point;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  public static void main(String[] args) {
    DriverDatabase driverDatabase = DriverDatabase.getInstance();
    UberMain  uberPage = new UberMain(driverDatabase);
    Driver driver = new Driver(1, "AVAILABLE", "Vasu", uberPage);
    driverDatabase.addDriver(driver);
    Passenger passenger = new Passenger("vnsharma", "temp", uberPage);
    Point startCoor = new Point(10, 20);
    Point endCoor = new Point(5, 30);
    RideRequest request = new RideRequest(null, passenger, startCoor, endCoor, RideStatus.PENDING);
    uberPage.createRide(request);

    driver.completeRide();
  }
}
