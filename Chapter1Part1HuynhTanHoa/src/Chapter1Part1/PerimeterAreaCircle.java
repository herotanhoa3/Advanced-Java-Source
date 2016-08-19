/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

/**
 *
 * @author hv
 */
public class PerimeterAreaCircle {

    DistancePoints dis;

    public PerimeterAreaCircle() {
        dis = new DistancePoints();
        dis.inputDistance();
    }
    double perimeter;
    double area;
    
    //method calculate perimeter
    public double calculatePerimeter() {
        perimeter = (dis.calculateDistance()) * 2 * 3.14;
        return perimeter;
    }
    //method calculate Area
    public double calculateArea() {
        area = (dis.calculateDistance()) * (dis.calculateDistance()) * 3.14;
        return area;
    }

}
