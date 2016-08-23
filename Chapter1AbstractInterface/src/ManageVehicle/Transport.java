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
public class Transport extends Vehicle {

    public String id;
    public String owner;
    public String color;
    public String manufacturer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Transport(double distance, double time, double numberLiter,
            String id, String owner, String color, String manufacturer) {
        super(distance, time, numberLiter);
        this.id = id;
        this.owner = owner;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public Transport() {
    }

    public Transport(double distance, double time, double numberLiter) {
        super(distance, time, numberLiter);
    }
    //Method Show VehInformation Transport
    public void showInformationTransport() {
        System.out.println("ID: " + id);
        System.out.println("Owner: " + owner);
        System.out.println("Color: " + color);
        System.out.println("Manufacturer: " + manufacturer);
    }
}
