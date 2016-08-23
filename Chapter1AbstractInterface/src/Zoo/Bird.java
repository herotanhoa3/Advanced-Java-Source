/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author hv
 */
public class Bird extends Animal implements IFlying, IRunning, ISwimming, IResident, IGrowing {

    public Bird(String name, String food) {
        super(name, food);
    }

    public Bird() {
    }

    @Override
    public void fly() {
        System.out.println("Can Fly");
    }

    @Override
    public void run() {
        System.out.println("Can Run");
    }

    @Override
    public void swim() {
        System.out.println("Can Swim");
    }

    @Override
    public void resident() {
        System.out.println("Nest");
    }

    @Override
    public void grow() {
        System.out.println("Molt");
    }

    void showInfo() {
        System.out.println("-------Bird-------");
        System.out.println("Name: " + getName());
        System.out.println("Food: " + getFood());
        System.out.println("Moving: ");
        fly();
        run();
        swim();
        System.out.print("Resident: ");
        resident();
        System.out.print("Growing: ");
        grow();
    }

}
