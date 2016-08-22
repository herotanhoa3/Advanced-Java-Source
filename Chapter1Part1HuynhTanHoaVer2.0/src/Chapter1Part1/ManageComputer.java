/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hv
 */
public class ManageComputer {
    //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    Scanner input = new Scanner(System.in);
    ArrayList<Desktop> ListDesk;
    ArrayList<Laptop> ListLap;
    Computer com;
    Desktop des;
    Laptop lap;
    String kind = "";
    boolean check;
    String str = "";

    public ManageComputer() {
        ListDesk = new ArrayList<>();
        ListLap = new ArrayList<>();
    }
    //Method Override show manage of Computer
    public void inputInfoComputer() throws IOException{
        check = true;
        while (check) {
            try {
                System.out.println("Choose kind computer Desktop(1)/ Laptop(2)");
                kind = input.next();
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            if (kind.equalsIgnoreCase("1") ) {
                des = new Desktop();
                des.inputInfo();
                ListDesk.add(des);
            } else if (kind.equalsIgnoreCase("2")) {
                lap = new Laptop();
                lap.inputInfo();
                ListLap.add(lap);
            } else {
                System.err.println("Input wrong format!! Please input (1) or (2)");
                continue;
            }

            System.out.println("Do you want add continue 'Y' or 'N'");
            str = input.next();
            if (str.equalsIgnoreCase("y")) {
                continue;
            } else {
                check = false;
            }

        }
        double s = 0;
        for (Desktop des : ListDesk) {
            System.out.println("Information of Computer kind Desktop: ");
            s += des.calculateBill();
            des.showInfo();
        }
        for (Laptop lap : ListLap) {
            System.out.println("Information of Computer kind Laptop: ");
            s += lap.calculateBill();
            lap.showInfo();
        }
        System.out.println("Total Price: " + String.format("%.1f", s));

    }
}
