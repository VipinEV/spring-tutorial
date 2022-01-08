package uk.co.allianz.training;

public class Application {

    Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void printSpeed() {
        Vehicle vehicleInstance = vehicle;
        vehicleInstance.speed();
    }

}

