/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageExchange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hoa Huynh
 * DATE: 23/08/2016
 * VER 1.0
 */
public class Exchange {

    public Exchange(String idExchange, String dateExchange, int numberExchange) {
        this.idExchange = idExchange;
        this.dateExchange = dateExchange;
        this.numberExchange = numberExchange;
    }
    public Exchange(){
    }
    public BufferedReader getInput() {
        return input;
    }

    public void setInput(BufferedReader input) {
        this.input = input;
    }

    public String getIdExchange() {
        return idExchange;
    }

    public void setIdExchange(String idExchange) {
        this.idExchange = idExchange;
    }

    public String getDateExchange() {
        return dateExchange;
    }

    public void setDateExchange(String dateExchange) {
        this.dateExchange = dateExchange;
    }

    public int getNumberExchange() {
        return numberExchange;
    }

    public void setNumberExchange(int numberExchange) {
        this.numberExchange = numberExchange;
    }
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String idExchange;
    String dateExchange;
    int numberExchange;
    boolean check;
    //method input information of Exchange
    public void inputInfo() throws IOException {
        System.out.println("Exchange ID:");
        idExchange = input.readLine();
        System.out.println("Exchange Date:");
        dateExchange = input.readLine();
        check = true;
        while (check) {
            try {
                System.out.println("number of Exchange:");
                numberExchange = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            check = false;
        }
    }
    // method show information of Exchange
    public void showInfo(){
        System.out.println("Exchange ID: " + idExchange);
        System.out.println("Exchange Date: " + dateExchange);
        System.out.println("number of Exchange: " + numberExchange);
    }
    
}
