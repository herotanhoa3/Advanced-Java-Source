/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerimeterAreaShape;

import com.sun.jmx.snmp.BerDecoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author Huynh Tan Hoa
 * 23/08/2016
 * Version 1.0
 */
public class ShapeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean check;
        int choose = 0;
        check = true;
        while (check) {
            try {
                System.out.println("Choose shape want calculate Circle(1) /Rectangle(2) /Square(3)");
                choose = Integer.parseInt(input.readLine());
                if (choose == 1) {
                    Circle cir = new Circle();
                    System.out.println("Input radius circle: ");
                    cir.setR(Integer.parseInt(input.readLine()));
                    System.out.println("Perimeter circle: " + cir.perimeter());
                    System.out.println("Area circle: " + cir.area());
                } else if (choose == 2) {
                    Rectangle rec = new Rectangle();
                    System.out.println("Input length rectangle: ");
                    rec.setLength(Integer.parseInt(input.readLine()));
                    System.out.println("Input width rectangle: ");
                    rec.setWidth(Integer.parseInt(input.readLine()));
                    System.out.println("Perimeter rectangle: " + rec.perimeter());
                    System.out.println("Area rectangle: " + rec.area());
                } else if (choose == 3) {
                    Square sq = new Square();
                    System.out.println("Input width square: ");
                    sq.setWidth(Integer.parseInt(input.readLine()));
                    System.out.println("Perimeter square: " + sq.perimeter());
                    System.out.println("Area square: " + sq.area());
                } else {
                    System.err.println("Please choose 1 to 3!!");
                    continue;
                }
            } catch (Exception e) {
                System.err.println("Error: Wrong format!!");
                System.err.println("Please choose 1 to 3!!");
                continue;
            }
            check = false;
        }
    }

}
