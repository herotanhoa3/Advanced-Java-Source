/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerimeterAreaShape;

/**
 *
 * @author Huynh Tan Hoa
 * 23/08/2016
 * Version 1.0
 */
public class Circle extends Shape {

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double r;
    //Method Override
    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
     //Method Override
    @Override
    public double area() {
         return Math.PI * Math.pow(r, 2);
    }

}
