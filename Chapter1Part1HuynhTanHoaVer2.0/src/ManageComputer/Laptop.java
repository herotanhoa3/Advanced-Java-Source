/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageComputer;

import java.io.IOException;

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

    public Laptop() {
    }
    int weight;
    int battery;
    int screenSize;
    boolean check;

    public Laptop(int id, int price, String manufacturer, int numberInput, int weight, int battery, int screenSize) {
        super(id, price, manufacturer, numberInput);
        this.weight = weight;
        this.battery = battery;
        this.screenSize = screenSize;
    }
    //Method Override input information of Laptop
    @Override
    public void inputInfo() throws IOException {
        super.inputInfo();
        check = true;
        while (check) {
            try {
                System.out.println("Input Weight: ");
                setWeight(Integer.parseInt(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            check = false;
        }
        while (check) {
            try {
                System.out.println("Input Battery: ");
                setBattery(Integer.parseInt(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Input Screen size: ");
                setScreenSize(Integer.parseInt(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            check = false;
        }
    }
    //Method Override show information of Laptop
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight);
        System.out.println("Battery: " + battery);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Total amount: " + String.format("%.1f", calculateBill()));
    }
}
