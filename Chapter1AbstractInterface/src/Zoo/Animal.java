/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Huynh Tan Hoa
 * 23/08/2016
 * Version 1.0
 */
public abstract class Animal {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public Animal() {
    }
    String name;
    String food;
    
}
