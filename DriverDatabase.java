package Uber;

import java.util.ArrayList;
import java.util.List;

public class DriverDatabase {
  private static  DriverDatabase instance;
  private List<Driver> driversList;

  private DriverDatabase(){
     driversList = new ArrayList<Driver>();
  };

  public static DriverDatabase getInstance() {
    if(instance == null){
        instance = new DriverDatabase();
    }
    return instance;
  }


  public void addDriver(Driver driver){
    this.driversList.add(driver);
  }

  public List<Driver> getAllDrivers() {
    System.out.println(this.driversList.size());
    return this.driversList;
  }
}
