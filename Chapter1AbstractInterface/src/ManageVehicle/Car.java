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
public class Car extends Transport implements ITransport {

    public String gearType;
    public String carType;

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Car(double distance, double time, double numberLiter, String id,
            String owner, String color, String manufacturer, String gearType,
            String carType) {
        super(distance, time, numberLiter, id, owner, color, manufacturer);
        this.gearType = gearType;
        this.carType = carType;
    }

    public Car() {
        super();
    }

    public Car(double distance, double time, double numberLiter, String id,
            String owner, String color, String manufacturer) {
        super(distance, time, numberLiter, id, owner, color, manufacturer);
        
    }

    public Car(double distance, double time, double numberLiter) {
        super(distance, time, numberLiter);
    }

    @Override
    public double getSpeed() {
        return distance / time;
    }

    @Override
    public double getFuelConsumption() {
        return distance / numberLiter;
    }
    //Method Override show Information Transport
    @Override
    public void showInformationTransport() {
        super.showInformationTransport();
        System.out.println("Gear type: " + gearType);
        System.out.println("Car type: " + carType);
        System.out.println("Speed: " + getSpeed());
        System.out.println("Fuel consumption: " + getFuelConsumption());
    }
}
