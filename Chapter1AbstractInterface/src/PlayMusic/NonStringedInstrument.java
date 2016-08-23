/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayMusic;

/**
 *
 * @author Huynh Tan Hoa
 * 23/08/2016
 * Version 1.0
 */
public class NonStringedInstrument extends Instrument {

    public String getUseWay() {
        return useWay;
    }

    public void setUseWay(String useWay) {
        this.useWay = useWay;
    }

    public NonStringedInstrument(String useWay, String name, String manufactory) {
        super(name, manufactory);
        this.useWay = useWay;
    }
    public NonStringedInstrument(){
    }
    String useWay;

    @Override
    void play() {
        System.out.println("name instrument:  " + super.name);
        System.out.println("manufactory instrument:  "+ super.manufactory);
        System.out.println("Use way: " + useWay);
    }

}
