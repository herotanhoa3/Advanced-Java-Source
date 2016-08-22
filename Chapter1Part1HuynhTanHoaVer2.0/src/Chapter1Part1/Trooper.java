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
public class Trooper extends Soldier{

    @Override
    public int fight() {
        power = power - 3;
        return  power;
    }
    
}
