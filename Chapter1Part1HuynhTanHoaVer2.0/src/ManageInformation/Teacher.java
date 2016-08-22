/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageInformation;

import java.io.IOException;

/**
 *
 * @author hv
 */
public class Teacher extends Human {

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public Teacher(double coefficient, double allowance, String chairman, String fullname, String dateOfBirth, String address, String numberPhone) {
        super(fullname, dateOfBirth, address, numberPhone);
        this.coefficient = coefficient;
        this.allowance = allowance;
        this.chairman = chairman;
    }

    public Teacher() {
    }
    double coefficient;
    double allowance;
    String chairman;
    boolean check;
    double salary;
    
    @Override
    public void inputInfo() throws IOException {
        super.inputInfo();
        check = true;
        while (check) {
            try {
                System.out.println("Input Coefficient: ");
                setCoefficient(Double.parseDouble(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (double)");
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Input Allowance: ");
                setAllowance(Double.parseDouble(input.readLine()));
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (double)");
                continue;
            }
            check = false;
        }
        System.out.println("Input Chairman in Class: ");
        setChairman(input.readLine());
    }
    public double calculateSalary(){
        salary = getCoefficient() * 1260000 + getAllowance();
        return salary;
    }
    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("Coefficient: "+getCoefficient());
        System.out.println("Allowance: "+getCoefficient());
        System.out.println("Chairman of: "+getCoefficient());
        System.out.println("Salary : "+calculateSalary());
    }
    
    

}
