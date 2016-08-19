package Chapter1Part1;

import java.nio.file.FileVisitResult;
import java.util.Scanner;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huynh Tan Hoa - Date :19/08/2016 - Version: 1.0
 */
public class Operator {

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    int firstNumber;
    int secondNumber;

    public Operator() {
    }

    public Operator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    // method calculate Sum
    public double calculatePlus() {
        double sum = 0;
        sum = firstNumber + secondNumber;
        return sum;
    }

    // method calculate Substruction
    public double calculateMinus() {
        double sub = 0;
        sub = firstNumber - secondNumber;
        return sub;
    }

    // method calculate Division
    public double calculateDivide() {
        double div = 0;
        div = firstNumber / secondNumber;
        return div;
    }

    // method calculate Multiplication 
    public double calculateMulti() {
        double mul = 0;
        mul = firstNumber * secondNumber;
        return mul;
    }
    public Scanner input = new Scanner(System.in);
    
    //method choose calculator
    public void chooseCalculate() {
        int choose = 0;
        System.out.println("Choose Calculator (Plus(1)/ Minus(2)/ Divide(3)/ Multi(4))");
        choose = input.nextInt();
        System.out.println("Input firstNumber: ");
        firstNumber = input.nextInt();
        System.out.println("Input secondNumber: ");
        secondNumber = input.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Result: " + calculatePlus());
                break;
            case 2:
                System.out.println("Result: " + calculateMinus());
                break;
            case 3:
                System.out.println("Result: " + calculateDivide());
                break;
            case 4:
                System.out.println("Result: " + calculateMulti());
                break;
            default:
                System.out.println("Error: Please choose from 1 to 4");
                break;
        }
    }
}
