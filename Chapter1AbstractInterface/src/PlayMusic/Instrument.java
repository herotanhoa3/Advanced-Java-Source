/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayMusic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Huynh Tan Hoa
 * 23/08/2016
 * Version 1.0
 */
public abstract class Instrument {

    public BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public Instrument(String name, String manufactory) {
        this.name = name;
        this.manufactory = manufactory;
    }

    public Instrument() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactory() {
        return manufactory;
    }

    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }
    String name;
    String manufactory;

    abstract void play(); 
}
