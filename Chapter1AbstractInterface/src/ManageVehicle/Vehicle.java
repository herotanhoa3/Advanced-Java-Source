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
public class Vehicle {

    public double distance;
    public double time;
    public double numberLiter;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getNumberLiterFuel() {
        return numberLiter;
    }

    public void setNumberLiterFuel(double numberLiterFuel) {
        this.numberLiter = numberLiterFuel;
    }

    public Vehicle(double distance, double time, double numberLiter) {
        this.distance = distance;
        this.time = time;
        this.numberLiter = numberLiter;
    }

    public Vehicle() {
    }
}
