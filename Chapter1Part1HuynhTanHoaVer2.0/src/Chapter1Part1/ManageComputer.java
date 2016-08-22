/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hv
 */
public class ManageComputer {

    Scanner input = new Scanner(System.in);
    ArrayList<Computer> ListCp;
    Computer com;
    Desktop des;
    Laptop lap;
    int kind = 0;
    boolean check;
    String str = "";

    public ManageComputer() {
        ListCp = new ArrayList<>();
    }

    public void inputInfoComputer() {
        check=true;
        while (check) {
            com = new Computer();
            System.out.println("Input ID: ");
            com.setId(input.nextInt());
            System.out.println("Input: ");
            com.setPrice(input.nextInt());
            System.out.println("Input Manufacturer: ");
            com.setManufacturer(input.next());
            System.out.println("Input Number: ");
            com.setNumberInput(input.nextInt());
            System.out.println("Choose kind comuter Desktop(1)/ Laptop(2)");
            kind = input.nextInt();
            if (kind == 1) {
                des = new Desktop();
                System.out.println("Input CPU: ");
                des.setCPU(input.next());
                System.out.println("Input RAM: ");
                des.setRAM(input.next());
                ListCp.add(des);
                System.out.println("Total Price: " + des.calculateBill());
            } else if (kind == 2) {
                lap = new Laptop();
                System.out.println("Input Weight: ");
                lap.setWeight(input.nextInt());
                System.out.println("Input Battery: ");
                lap.setBattery(input.nextInt());
                System.out.println("Input Screen size: ");
                lap.setScreenSize(input.nextInt());
                ListCp.add(lap);
                System.out.println("Total Price: " + lap.calculateBill());
            }
            System.out.println("Do you want add continue 'Y' or 'N'");
            str = input.next();

            if (str != "y" || str != "Y") {
                continue;
            }
            check = false;
        }
        double s = 0;
        for (int i = 0; i < ListCp.size(); i++) {
            System.out.println("[Computer No " + (i + 1) + "]:");
            ListCp.get(i).showInfo();
            s += ListCp.get(i).calculateBill();
            System.out.println("-----------------");

        }
        System.out.println("Total Price: " + String.format("%.1f", s));

    }
}
