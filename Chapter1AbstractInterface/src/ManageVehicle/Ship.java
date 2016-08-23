/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageVehicle;

/**
 *
 * @author Huynh Tan Hoa
 * 23/08/2016
 * Version 1.0
 */
public class Ship extends Transport implements ITransport {

    public double weight;
    public double capacity;
    public double downstreamSpeed;
    public double upstreamSpeed;
    public double fuelConsumptionStart;
    public String fuelType;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDownstreamSpeed() {
        return downstreamSpeed;
    }

    public void setDownstreamSpeed(double downstreamSpeed) {
        this.downstreamSpeed = downstreamSpeed;
    }

    public double getUpstreamSpeed() {
        return upstreamSpeed;
    }

    public void setUpstreamSpeed(double upstreamSpeed) {
        this.upstreamSpeed = upstreamSpeed;
    }

    public double getFuelConsumptionStart() {
        return fuelConsumptionStart;
    }

    public void setFuelConsumptionStart(double fuelConsumptionStart) {
        this.fuelConsumptionStart = fuelConsumptionStart;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Ship(double distance, double time, double numberLiter,
            String id, String owner, String color, String manufacturer,
            double weight, double capacity, double downstreamSpeed,
            double upstreamSpeed, double fuelConsumptionStart, String fuelType) {
        super(distance, time, numberLiter, id, owner, color, manufacturer);
        this.weight = weight;
        this.capacity = capacity;
        this.downstreamSpeed = downstreamSpeed;
        this.upstreamSpeed = upstreamSpeed;
        this.fuelConsumptionStart = fuelConsumptionStart;
        this.fuelType = fuelType;
    }

    public Ship() {
    }

    public Ship(double distance, double time, double numberLiter,
            String id, String owner, String color, String manufacturer) {
        super(distance, time, numberLiter, id, owner, color, manufacturer);
       
    }

    public Ship(double distance, double time, double numberLiter) {
        super(distance, time, numberLiter);
    }

    @Override
    public double getSpeed() {
        return (distance / time) + (downstreamSpeed - upstreamSpeed);
    }

    @Override
    public double getFuelConsumption() {
        return distance / (numberLiter - fuelConsumptionStart);

    }
    //Method Override show Information Transport
    @Override
    public void showInformationTransport() {
        super.showInformationTransport();
        System.out.println("Weight: " + weight);
        System.out.println("Capacity: " + capacity);
        System.out.println("Downstream speed: " + downstreamSpeed);
        System.out.println("Upstream speed: " + upstreamSpeed);
        System.out.println("Fuel consumption start: " + fuelConsumptionStart);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Speed: " + getSpeed());
        System.out.println("Fuel consumption: " + getFuelConsumption());
    }
}
