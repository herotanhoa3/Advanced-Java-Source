/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayMusic;

import java.io.IOException;

/**
 *
 * @author Huynh Tan Hoa
 * 23/08/2016
 * Version 1.0
 */
public class StringedInstrument extends Instrument {

    public int getNumberStringed() {
        return numberStringed;
    }

    public void setNumberStringed(int numberStringed) {
        this.numberStringed = numberStringed;
    }
    Instrument in;
    public StringedInstrument(int numberStringed, String name, String manufactory) {
        super(name, manufactory);
        this.numberStringed = numberStringed;
    }
    public StringedInstrument(){
    }

    
    int numberStringed;
    @Override
    void play(){
        System.out.println("name instrument:  "+ super.name);
        System.out.println("manufactory instrument:  "+ super.manufactory);
        System.out.println("number stringed: " + numberStringed);
    }

}
