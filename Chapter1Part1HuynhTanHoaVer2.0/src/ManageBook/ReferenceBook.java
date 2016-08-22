/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBook;

import java.io.IOException;

/**
 *
 * @author Hoa Huynh
 */
public class ReferenceBook extends Book {

    public ReferenceBook() {
    }
    public ReferenceBook(double tax, String id, String name, String date, double price, int number, String publisher) {
        super(id, name, date, price, number, publisher);
        this.tax = tax;
    }
    double tax;
    //METHOD calculate Price
    @Override
    public double calculatePrice() {
        return super.calculatePrice() + super.calculatePrice() * (tax / 100);
    }
    //METHOD OVERRIDE INPUT INFORMATION BOOK    
    @Override
    public void inputInfo() throws IOException {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        boolean check = true;
        while (check) {
            try {
                System.out.println("tax of Book:(%)");
                tax = Double.parseDouble(input.readLine());
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (Double)");
                continue;
            }
            if (tax < 1 || tax > 100) {
                System.err.println("tax of Book olny 1 to 100 !!");
                continue;
            }
            check = false;
        }
    }
    //METHOD OVERRIDE OUTPUT INFORMATION BOOK
    @Override
    public void outputInfo() {
        super.outputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("tax of Book: " + tax + " %");
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

}
