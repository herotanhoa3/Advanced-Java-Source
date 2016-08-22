/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author Hoa Huynh
 * DATE: 23/08/2016
 * VER 1.0
 */
public class Human {
    public BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Human(String fullname, String dateOfBirth, String address, String numberPhone) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public Human() {

    }
    String fullname;
    String dateOfBirth;
    String address;
    String numberPhone;
    public void inputInfo()throws IOException{
        System.out.println("Input full name: ");
        setFullname(input.readLine());
        System.out.println("Input day of birth: ");
        setDateOfBirth(input.readLine());
        System.out.println("Input address: ");
        setAddress(input.readLine());
        System.out.println("Input number phone: ");
        setNumberPhone(input.readLine());
    }
    public void showInfo(){
        System.out.println("Full name: "+getFullname());
        System.out.println("Day of birth: "+getDateOfBirth());
        System.out.println("Address: "+getAddress());
        System.out.println("Number phone: "+getNumberPhone());
    }
}
