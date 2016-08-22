/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hoa Huynh
 * DATE: 23/08/2016
 * VER 1.0
 */
public class Book {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Book() {
    }
    public Book(String id, String name, String date, double price, int number, String publisher) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.number = number;
        this.publisher = publisher;
    }
    String id;
    String name;
    String date;
    double price;
    int number;
    String publisher;
    

    // METHOD CALCULATE MONEY
    public double calculatePrice() {
        return this.number * this.price;
    }
    //METHOD INPUT INFORMATION BOOK
    public void inputInfo() throws IOException {
        System.out.println("Input book id:");
        id = input.readLine();
        System.out.println("Input book name:");
        name = input.readLine();
        System.out.println("Input book input date:");
        date = input.readLine();
        boolean check = true;
        while (check) {
            try {
                System.out.println("Input price:");
                price = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("number of book:");
                number = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            check = false;
        }
        System.out.println("publisher of book:");
        publisher = input.readLine();
    }
    //METHOD SHOW INFORMATION BOOK
    public void outputInfo() {
        System.out.println("ID: " + id);
        System.out.println("Book name: " + name);
        System.out.println("Book date: " + date);
        System.out.println("price of Book: " + price);
        System.out.println("number of Book : " + number);
        System.out.println("publisher of Book : " + publisher);
    }

   
}
