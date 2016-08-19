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
public class PerimeterAreaRectangle {

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public PerimeterAreaRectangle() {
        dis = new DistancePoints();
        dis.inputDistance();
    }

    DistancePoints dis;
    double perimeter;
    double area;

    public double calculatePerimeter() {
        perimeter = ((dis.pointBx - dis.pointAx) + (dis.pointBy - dis.pointAy)) * 2;
        if(perimeter < 0)
        {
            perimeter = -(perimeter);
        }
        return perimeter;
    }

    public double calculateArea() {
        area = ((dis.pointBx - dis.pointAx) * (dis.pointBy - dis.pointAy)) ;
        if(area < 0)
        {
            area = -(area);
        }
        return area;
    }
}
