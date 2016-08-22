/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageComputer;

import java.io.IOException;

/**
 *
 * @author Hoa Huynh
 * DATE: 23/08/2016
 * VER 1.0
 */
public class Desktop extends Computer {

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public Desktop() {
    }
    String CPU;
    String RAM;
    public Desktop(int id, int price, String manufacturer, int numberInput, String CPU, String RAM) {
        super(id, price, manufacturer, numberInput);
        this.CPU = CPU;
        this.RAM = RAM;
    }
    //Method Override input information of Desktop
    @Override
    public void inputInfo() throws IOException{
        super.inputInfo();
        System.out.println("Input CPU: ");
        setCPU(input.readLine());
        System.out.println("Input RAM: ");
        setRAM(input.readLine());
    }
    //Method Override show information of Desktop
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Total amount: " + String.format("%.1f", calculateBill()));
    }
}
