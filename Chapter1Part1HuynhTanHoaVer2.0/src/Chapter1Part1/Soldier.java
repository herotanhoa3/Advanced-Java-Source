/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

import java.util.Scanner;

/**
 *
 * Huynh Tan Hoa 22/08/2016 Ver 1.0
 */
public class Soldier {

    public Scanner input = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Soldier(String name, int power, String weapon) {
        this.name = name;
        this.power = power;
        this.weapon = weapon;
    }

    public Soldier() {
    }
    String name;
    int power;
    String weapon;
    boolean check;

    //method fight of soldier
    public int fight() {
        return --power;
    }
     //method input for soldier
    public void inputInfoSoldier() {
        check = true;
        while (check) {
            try {
                setName(input.next());
                System.out.println("Input power: ");
                setPower(input.nextInt());
                System.out.println("Input weapon: ");
                setWeapon(input.next());
            } catch (Exception e) {
                System.err.println("Error: " + e.toString());
                System.err.println("Input wrong !!!");
                continue;
            }
            check = false;
        }

    }
}
