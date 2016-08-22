/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageInformation;

import java.io.IOException;

/**
 *
 * @author Hoa Huynh
 * DATE: 23/08/2016
 * VER 1.0
 */
public class Student extends Human {

    public String getInClass() {
        return inClass;
    }

    public void setInClass(String inClass) {
        this.inClass = inClass;
    }

    public double getMarkSemester1() {
        return markSemester1;
    }

    public void setMarkSemester1(double markSemester1) {
        this.markSemester1 = markSemester1;
    }

    public double getMarkSemester2() {
        return markSemester2;
    }

    public void setMarkSemester2(double markSemester2) {
        this.markSemester2 = markSemester2;
    }

    public Student(String inClass, double markSemester1, double markSemester2, String fullname, String dateOfBirth, String address, String numberPhone) {
        super(fullname, dateOfBirth, address, numberPhone);
        this.inClass = inClass;
        this.markSemester1 = markSemester1;
        this.markSemester2 = markSemester2;
    }

    public Student() {
    }
    String inClass;
    double markSemester1;
    double markSemester2;
    boolean check;
    double average;

    @Override
    public void inputInfo() throws IOException {
        super.inputInfo();
        System.out.println("Input studen in class: ");
        setInClass(input.readLine());
        check = true;
        while (check) {
            try {
                System.out.println("Input mark semester 1: ");
                setMarkSemester1(Double.parseDouble(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (double)");
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Input mark semester 2: ");
                setMarkSemester2(Double.parseDouble(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (double)");
                continue;
            }
            check = false;
        }
    }

    public double calculateAverage() {
        average = (markSemester1 + markSemester2) / 2;
        return average;
    }
    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("Studen in class: "+getInClass());
        System.out.println("Mark semester 1: "+getMarkSemester1());
        System.out.println("Mark semester 2: "+getMarkSemester2());
        System.out.println("Average : "+calculateAverage());
    }

}
