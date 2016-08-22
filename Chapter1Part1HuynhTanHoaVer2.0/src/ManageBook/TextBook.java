/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBook;

import java.io.IOException;

/**
 *
 *@author Hoa Huynh
 * DATE: 23/08/2016
 * VER 1.0
 */
public class TextBook extends Book {

    public TextBook() {
    }

    public TextBook(String id, String name, String date, double price, int number, String publisher) {
        super(id, name, date, price, number, publisher);
    }
    int state;

    public TextBook(int state, String id, String name, String date, double price, int number, String publisher) {
        super(id, name, date, price, number, publisher);
        this.state = state;
    }
    //METHOD calculate Price
    @Override
    public double calculatePrice() {
        if (state == 1) {
            return super.calculatePrice();
        } else {
            return super.calculatePrice() * .5f;
        }
    }
    //METHOD OVERRIDE INPUT INFORMATION BOOK
    @Override
    public void inputInfo() throws IOException {
        super.inputInfo();
        boolean check = true;
        while (check) {
            try {
                System.out.println("state of Book: new(1) / old(2)");
                state = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            if (state != 1 && state != 2) {
                System.err.println("Input wrong format!! Please input (1) or (2)");
                continue;
            }
            check = false;
        }
    }
    //METHOD OVERRIDE OUTPUT INFORMATION BOOK
    @Override
    public void outputInfo() {
        super.outputInfo();
        System.out.println("state of Book" + ((state == 1) ? "new" : "old"));
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
