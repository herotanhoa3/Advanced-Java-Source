/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

import java.util.Scanner;

/**
 *
 * @author Huynh Tan Hoa 
 * Date :19/08/2016 
 * Version: 1.0
 */
public class DistancePoints {

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getPointAx() {
        return pointAx;
    }

    public void setPointAx(int pointAx) {
        this.pointAx = pointAx;
    }

    public int getPointAy() {
        return pointAy;
    }

    public void setPointAy(int pointAy) {
        this.pointAy = pointAy;
    }

    public int getPointBx() {
        return pointBx;
    }

    public void setPointBx(int pointBx) {
        this.pointBx = pointBx;
    }

    public int getPointBy() {
        return pointBy;
    }

    public void setPointBy(int pointBy) {
        this.pointBy = pointBy;
    }

    public DistancePoints() {
    }

    public DistancePoints(int pointAx, int pointAy, int pointBx, int pointBy) {
        this.pointAx = pointAx;
        this.pointAy = pointAy;
        this.pointBx = pointBx;
        this.pointBy = pointBy;
    }
    int pointAx;
    int pointAy;
    int pointBx;
    int pointBy;
    double distance;

    //Method calculate distance
    public double calculateDistance() {
        distance = Math.sqrt((pointAx - pointBx) * (pointAx - pointBx) + (pointAy - pointBy) * (pointAy - pointBy));
        return distance;
    }
    Scanner input = new Scanner(System.in);

    //method input distance
    public void inputDistance() {
        try {
            System.out.println("Input Distance Ax: ");
            pointAx = input.nextInt();
            System.out.println("Input Distance Ay: ");
            pointAy = input.nextInt();
            System.out.println("Input Distance Bx: ");
            pointBx = input.nextInt();
            System.out.println("Input Distance By: ");
            pointBy = input.nextInt();
        } catch (Exception e) {
            System.out.println("Please input number");
            System.out.println("Error:  " + e.toString());
        }
    }
    
}
