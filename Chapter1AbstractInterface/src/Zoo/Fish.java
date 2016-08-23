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
public class Fish extends Animal implements ISwimming, IResident, IGrowing {

    public Fish(String name, String food) {
        super(name, food);
    }

    @Override
    public void swim() {
        System.out.println("Can Swim");
    }

    @Override
    public void resident() {
         System.out.println("Underwater");
    }

    @Override
    public void grow() {
        System.out.println("Grow");
    }
    void showInfo(){
        System.out.println("-------Fish-------");
        System.out.println("Name: "+getName());
        System.out.println("Food: "+ getFood());
        System.out.println("Moving: ");
        swim();
        System.out.print("Resident: ");
        resident();
        System.out.print("Growing: ");
        grow();
    }
}
