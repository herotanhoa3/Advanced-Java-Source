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
public class SalaryStaff {

    Scanner input = new Scanner(System.in);

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getRateSalary() {
        return rateSalary;
    }

    public void setRateSalary(double rateSalary) {
        this.rateSalary = rateSalary;
    }

    public double getNumberMember() {
        return numberMember;
    }

    public void setNumberMember(double numberMember) {
        this.numberMember = numberMember;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncomeHaveTax() {
        return incomeHaveTax;
    }

    public void setIncomeHaveTax(double incomeHaveTax) {
        this.incomeHaveTax = incomeHaveTax;
    }

    public double getPersonalTax() {
        return personalTax;
    }

    public void setPersonalTax(double personalTax) {
        this.personalTax = personalTax;
    }

    public double getRealIncome() {
        return realIncome;
    }

    public void setRealIncome(double realIncome) {
        this.realIncome = realIncome;
    }
    public SalaryStaff() {
    }
    String fullName;
    double rateSalary;
    double numberMember;
    double allowance;
    double income;
    double incomeHaveTax;
    double personalTax;
    double realIncome;
    double basicSalary = 1260000;
    double basicTax = 9000000;
    double basicReduce = 3600000;
    

   // Method input info Staff
    public void inputInfo() {
        try {
            System.out.println("Input full name Staff: ");
            setFullName(input.nextLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        try {
            System.out.println("Input rate of salary: ");
            setRateSalary(input.nextDouble());
            System.out.println("Input number of family allowances: ");
            setNumberMember(input.nextDouble());
            System.out.println("Input allowances: ");
            setAllowance(input.nextDouble());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            System.out.println("Please input numbber");
        }
    }
   // Method calculate salary of Staff
    public double calculateSalary() {

        income = rateSalary * basicSalary + allowance;
        incomeHaveTax = income - basicTax - numberMember * basicReduce;
        if (incomeHaveTax < 0) {
            incomeHaveTax = 0;
        }
        computePersonalIncomeTax(incomeHaveTax);
        realIncome = income - personalTax;
        return realIncome;
    }
    // Method calculate salary of Staff have Tax
    public double computePersonalIncomeTax(double incomeTax) {
        if (incomeTax < Level.Level1.getIncomeTax()) {

            personalTax = incomeTax * Level.Level1.getTax();

        } else if (incomeTax < Level.Level2.getIncomeTax()) {

            personalTax = Level.Level1.getMaxLeverTax();
            personalTax += (incomeTax - Level.Level1.getIncomeTax()) * Level.Level2.getTax();

        } else if (incomeTax < Level.Level3.getIncomeTax()) {

            personalTax = Level.Level1.getMaxLeverTax();
            personalTax += Level.Level2.getMaxLeverTax();
            personalTax += (incomeTax - Level.Level2.getIncomeTax()) * Level.Level3.getTax();

        } else if (incomeTax < Level.Level4.getIncomeTax()) {

            personalTax = Level.Level1.getMaxLeverTax();
            personalTax += Level.Level2.getMaxLeverTax();
            personalTax += Level.Level3.getMaxLeverTax();
            personalTax += (incomeTax - Level.Level3.getIncomeTax()) * Level.Level4.getTax();

        } else if (incomeTax < Level.Level5.getIncomeTax()) {

            personalTax = Level.Level1.getMaxLeverTax();
            personalTax += Level.Level2.getMaxLeverTax();
            personalTax += Level.Level3.getMaxLeverTax();
            personalTax += Level.Level4.getMaxLeverTax();
            personalTax += (incomeTax - Level.Level4.getIncomeTax()) * Level.Level5.getTax();

        } else if (incomeTax < Level.Level6.getIncomeTax()) {

            personalTax = Level.Level1.getMaxLeverTax();
            personalTax += Level.Level2.getMaxLeverTax();
            personalTax += Level.Level3.getMaxLeverTax();
            personalTax += Level.Level4.getMaxLeverTax();
            personalTax += Level.Level5.getMaxLeverTax();
            personalTax += (incomeTax - Level.Level5.getIncomeTax()) * Level.Level6.getTax();

        } else {

            personalTax = Level.Level1.getMaxLeverTax();
            personalTax += Level.Level2.getMaxLeverTax();
            personalTax += Level.Level3.getMaxLeverTax();
            personalTax += Level.Level4.getMaxLeverTax();
            personalTax += Level.Level5.getMaxLeverTax();
            personalTax += Level.Level6.getMaxLeverTax();
            personalTax += (incomeTax - Level.Level6.getIncomeTax()) * Level.Level7.getTax();
        }
        return personalTax;
    }
    // Method output info Staff
    public void outputInformationStaff() {

        System.out.println("Information Staff:");
        System.out.println("income :" + rateSalary + " * " + basicSalary + " + " + allowance + " = " + income);
        System.out.println("income Tax :" + income + " - " + basicTax + " - " + numberMember + " * " + basicReduce + " = " + incomeHaveTax);
        System.out.println("personal Income Tax :" + personalTax);
        System.out.println("real Salary :" + income + " - " + personalTax + " = " + realIncome);

    }
    // enum Level of Tax
    enum Level {
    Level1(5000000, 0.05, 250000),
    Level2(10000000, 0.1, 500000),
    Level3(18000000, 0.15, 1200000),
    Level4(32000000, 0.2, 2800000),
    Level5(52000000, 0.25, 5000000),
    Level6(80000000, 0.3, 8400000),
    Level7(80000000, 0.35, 8400000);

    private final double incomeTax;
    private final double tax;
    private final double maxLevelTax;

    private Level(double incomeTax, double tax, double maxLeverTax) {

        this.incomeTax = incomeTax;
        this.tax = tax;
        this.maxLevelTax = maxLeverTax;

    }

    public double getIncomeTax() {

        return this.incomeTax;

    }

    public double getTax() {

        return this.tax;

    }

    public double getMaxLeverTax() {

        return this.maxLevelTax;

    }
}
}
