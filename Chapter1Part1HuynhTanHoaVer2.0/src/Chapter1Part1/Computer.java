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
public class Computer {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumberInput() {
        return numberInput;
    }

    public void setNumberInput(int numberInput) {
        this.numberInput = numberInput;
    }
    

    public Computer(int id, int price, String manufacturer, int numberInput) {
        this.id = id;
        this.price = price;
        this.manufacturer = manufacturer;
        this.numberInput = numberInput;
    }
    public Computer() {
    }
    // General
    int id;
    int price;
    String manufacturer;
    int numberInput;
    double totalAmount;

    public double calculateBill() {
        totalAmount = price * numberInput;
        return totalAmount;
    }
    public void showInfo() {
        System.out.println("Id: " + id);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Number input: " + numberInput);
    }
}
