/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageVehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hoa Huynh
 */
public class ManageVehicle {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Car> ListCar;
    ArrayList<Ship> ListShip;
    Car car;
    Ship ship;

    public ManageVehicle() {
        ListCar = new ArrayList<Car>();
        ListShip = new ArrayList<Ship>();
    }
    //Method Manage Vehicle
    public void ManageVehicle() throws IOException {
        boolean check, checkie;
        check = true;
        checkie = true;
        int numberOfCar = 0;
        int numberOfShip = 0;
        double distance = 0;
        double time = 0;
        double numberLiter = 0;
        String choose = "";

        //check = true;
        while (checkie) {
            System.out.println("Input information of Transport");
            System.out.println("Input id:");
            String id = input.readLine();
            System.out.println("Input owner:");
            String owner = input.readLine();
            System.out.println("Input color:");
            String color = input.readLine();
            System.out.println("Input manufacturer:");
            String manufacturer = input.readLine();
            check = true;
            while (check) {
                try {
                    System.out.println("Input distance:");
                    distance = Double.parseDouble(input.readLine());
                } catch (Exception e) {
                    System.err.println("Error: Wrong format!!");
                    continue;
                }
                check = false;
            }
            check = true;
            while (check) {
                try {
                    System.out.println("Input time:");
                    time = Double.parseDouble(input.readLine());
                } catch (Exception e) {
                    System.err.println("Error: Wrong format!!");
                    continue;
                }
                check = false;
            }
            check = true;
            while (check) {
                try {
                    System.out.println("Input number liter of fuel");
                    numberLiter = Double.parseDouble(input.readLine());
                } catch (Exception e) {
                    System.err.println("Error: Wrong format!!");
                    continue;
                }
                check = false;
            }
            check = true;
            while (check) {
                try {
                    System.out.println("Choose Car(1)/ Ship(2)");
                    choose = input.readLine();
                    if (choose.compareTo("1") == 0) {
                        System.out.println("Input gear type:");
                        String gearType = input.readLine();
                        System.out.println("Input car type:");
                        String carType = input.readLine();
                        car = new Car(distance, time, numberLiter, id, owner, color, manufacturer, gearType, carType);
                        ListCar.add(car);
                    } else if (choose.compareTo("2") == 0) {
                        System.out.println("Input weight:");
                        double weight = Double.parseDouble(input.readLine());
                        System.out.println("Input capacity:");
                        double capacity = Double.parseDouble(input.readLine());
                        System.out.println("Input downstream speed:");
                        double downstreamSpeed = Double.parseDouble(input.readLine());
                        System.out.println("Input upstream speed:");
                        double upstreamSpeed = Double.parseDouble(input.readLine());
                        System.out.println("Input fuel consumption start:");
                        double fuelConsumptionStart = Double.parseDouble(input.readLine());
                        System.out.println("Input fuel type:");
                        String fuelType = input.readLine();
                        ship = new Ship(distance, time, numberLiter, id, owner, color, manufacturer, weight, capacity, downstreamSpeed, upstreamSpeed, fuelConsumptionStart, fuelType);
                        ListShip.add(ship);
                    } else {
                        System.out.println("Please just choose (1) or (2)");
                        continue;
                    }
                    check = false;
                } catch (Exception e) {
                    System.err.println("Error: Wrong format!!");
                    continue;
                }
            }
            System.out.print("Do you want to add Book 'Y' or 'N' ? ");
            String answer = input.readLine();
            if (answer.equalsIgnoreCase("y")) {
                continue;
            }

            for (Car car : ListCar) {
                System.out.println("Information of Car: ");
                car.showInformationTransport();
            }

            for (Ship ship : ListShip) {
                System.out.println("Information of Ship: ");
                ship.showInformationTransport();
            }
            checkie = false;

        }
    }
}
