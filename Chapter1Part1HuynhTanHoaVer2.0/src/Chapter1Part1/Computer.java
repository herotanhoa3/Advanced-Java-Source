/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author hv
 */
public class Computer {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    //Scanner input = new Scanner(System.in);

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
    boolean check;

    public double calculateBill() {
        totalAmount = price * numberInput;
        return totalAmount;
    }
    //Method input information of Computer
    public void inputInfo() throws IOException {
        check = true;
        while (check) {
            try {
                System.out.println("Input ID: ");
                setId(Integer.parseInt(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Input Price: ");
                setPrice(Integer.parseInt(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Input Manufacturer: ");
                setManufacturer(input.readLine());
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (String)");
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Input Number: ");
                setNumberInput(Integer.parseInt(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            check = false;
        }

    }

    //Method show information of Computer
    public void showInfo() {
        System.out.println("Id: " + id);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Number input: " + numberInput);
    }
}
