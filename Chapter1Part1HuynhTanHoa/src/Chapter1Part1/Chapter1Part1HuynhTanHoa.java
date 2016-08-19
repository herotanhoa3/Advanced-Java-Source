package Chapter1Part1;

import com.sun.xml.internal.ws.api.message.Message;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huynh Tan Hoa Date :19/08/2016 Version: 1.0
 */
public class Chapter1Part1HuynhTanHoa {

    /**
     * @param args the command line arguments
     */
    static Operator ope;
    static DistancePoints dis;
    static PerimeterAreaCircle per;
    static PerimeterAreaRectangle perRec;

    public static void main(String[] args) {
        // TODO code application logic here

        //part1();
        //part2();
        //part3();
        part4();
    }

    // mehtod call class operator
    static void part1() {
        ope = new Operator();
        try {
            ope.chooseCalculate();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            System.out.println("Please input number");
        }
    }

    // mehtod call class distance point
    static void part2() {
        dis = new DistancePoints();
        dis.inputDistance();
        System.out.println("Result: " + dis.calculateDistance());
    }
    // method call class perimeter area circle
    static void part3() {
        per = new PerimeterAreaCircle();
        System.out.println("Result Perimeter: " + per.calculatePerimeter());
        System.out.println("Result Area: " + per.calculateArea());
    }
    static void part4() {
        perRec = new PerimeterAreaRectangle();
        System.out.println("Result Perimeter: " + perRec.calculatePerimeter());
        System.out.println("Result Area: " + perRec.calculateArea());
    }

}
