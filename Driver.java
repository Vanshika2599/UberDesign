package Uber;

public class Driver {
    Integer Id;
    String status;
    String name;
    private UberMain main;
    private Ride onGoingRide;

    Driver(Integer Id, String status, String name, UberMain main) {
        this.Id = Id;
        this.status = status;
        this.name = name;
        this.main = main;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean acceptOrDeclineRide(Ride ride) {
        ride.setStatus("ACCEPTED");
        return true;
    }

    public void completeRide() {
        this.onGoingRide.setStatus("COMPLETED");
        main.notifyPassengerForPayment(onGoingRide);
    }

    public void setOngoingRide(Ride ride) {
        this.onGoingRide = ride;
    }

}
