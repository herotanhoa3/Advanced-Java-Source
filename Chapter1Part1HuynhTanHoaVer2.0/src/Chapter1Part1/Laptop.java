/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

/**
 *
 * @author hv
 */
public class Laptop extends Computer {

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
    public Laptop(){
    }
    int weight;
    int battery;
    int screenSize;

    public Laptop(int id, int price, String manufacturer, int numberInput, int weight, int battery, int screenSize) {
        super(id, price, manufacturer, numberInput);
        this.weight = weight;
        this.battery = battery;
        this.screenSize = screenSize;
    }
    public void showInfo() {
        showInfo();
        System.out.println("Weight: " + weight);
        System.out.println("Battery: " + battery);
        System.out.println("Screen Size: " + screenSize);
    }
}
