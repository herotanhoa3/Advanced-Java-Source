/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulatortFight;

/**
 *
 * @author Hoa Huynh
 * DATE: 23/08/2016
 * VER 1.0
 */
public class Trooper extends Soldier{

    @Override
    public int fight() {
        power = power - 3;
        return  power;
    }
    
}
