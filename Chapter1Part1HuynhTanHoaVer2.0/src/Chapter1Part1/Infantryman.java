/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Part1;

/**
 *
 * Huynh Tan Hoa 22/08/2016 Ver 1.0
 */
public class Infantryman extends Soldier {

    @Override
    public int fight() {
        power = power - 2;
        return  power;
    }
}
