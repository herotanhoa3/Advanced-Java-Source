/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulatortFight;

import java.util.Scanner;

/**
 *
 * Huynh Tan Hoa 22/08/2016 Ver 1.0
 */
public class SimulatorFight {

    public Scanner input = new Scanner(System.in);
    Soldier sol;
    Infantryman in;
    Trooper tr;
    boolean check;
    int turn;

    //method Battle of Soldier
    public void Fight() {
        in = new Infantryman();
        tr = new Trooper();
        System.out.println("Input name Infantryman");
        in.inputInfoSoldier();
        System.out.println("Input name Trooper");
        tr.inputInfoSoldier();
        check = true;
        while (check) {
            System.out.println("Power of Infantryman: " + in.power);
            System.out.println("Power of Trooper: " + tr.power);
            try {
                System.out.println("Choose Infantryman(1) or Trooper(2) fight");
                turn = input.nextInt();
                if (turn != 1 && turn != 2) {
                    System.err.println("Input wrong format !!");
                    continue;
                }
            } catch (Exception e) {
                System.err.println("Input wrong format !!");
                continue;
            }
            // Check turn of who
            if (turn == 1) {
                in.fight();
            } else {
                tr.fight();
            }
            // Check Soldier win 
            if (in.power <= 0) {
                System.out.println("Trooper won !!!");
                check = false;
            } else if (tr.power <= 0) {
                System.out.println("Infantryman won !!!");
                check = false;
            }
        }

    }
}
