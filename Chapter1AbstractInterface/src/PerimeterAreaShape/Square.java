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
public class Square extends Shape {

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double width;
     //Method Override
    @Override
    public double perimeter() {
        return width * 4;
    }
     //Method Override
    @Override
    public double area() {
        return width * width;
    }

}
