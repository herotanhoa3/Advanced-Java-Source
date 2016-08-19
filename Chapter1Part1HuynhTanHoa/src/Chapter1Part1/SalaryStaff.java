/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

import java.util.Scanner;

/**
 *
 * @author hv
 */
public class SalaryStaff {

    Scanner input = new Scanner(System.in);

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getRateSalary() {
        return rateSalary;
    }

    public void setRateSalary(int rateSalary) {
        this.rateSalary = rateSalary;
    }

    public int getNumberMember() {
        return numberMember;
    }

    public void setNumberMember(int numberMember) {
        this.numberMember = numberMember;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getIncomeHaveTax() {
        return incomeHaveTax;
    }

    public void setIncomeHaveTax(int incomeHaveTax) {
        this.incomeHaveTax = incomeHaveTax;
    }

    public int getPersonalTax() {
        return personalTax;
    }

    public void setPersonalTax(int personalTax) {
        this.personalTax = personalTax;
    }

    public int getRealIncome() {
        return realIncome;
    }

    public void setRealIncome(int realIncome) {
        this.realIncome = realIncome;
    }
    String fullName;
    int rateSalary;
    int numberMember;
    int allowance;
    int income;
    int incomeHaveTax;
    int personalTax;
    int realIncome;

    public SalaryStaff() {
    }

    public double calculateSalary() {

        return 0;
    }

    public void inputInfo() {
        try {
            System.out.println("Input full name Staff: ");
            setFullName(input.nextLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        try {
            System.out.println("Input rate of salaryl: ");
            setRateSalary(input.nextInt());
            System.out.println("Input number of family allowances: ");
            setNumberMember(input.nextInt());
            System.out.println("Input allowances: ");
            setAllowance(input.nextInt());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            System.out.println("Please input numbber");
        }
    }

}
