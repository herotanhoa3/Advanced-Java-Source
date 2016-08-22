/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

/**
 *
 * @author hv
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
    public Desktop(){
    }
    String CPU;
    String RAM;
    public Desktop (int id, int price, String manufacturer, int numberInput, String CPU, String RAM) {
        super(id, price, manufacturer, numberInput);
        this.CPU = CPU;
        this.RAM = RAM;
    }
    public void showInfo() {
        showInfo();
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
    }
}
