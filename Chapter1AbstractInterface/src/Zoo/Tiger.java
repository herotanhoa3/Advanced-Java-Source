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
public class Tiger extends Animal implements IRunning, IResident, IGrowing{

    public Tiger(String name, String food) {
        super(name, food);
    }

    @Override
    public void run() {
        System.out.println("Can Run");
    }

    @Override
    public void resident() {
        System.out.println("Cave");
    }

    @Override
    public void grow() {
        System.out.println("Grow");
    }
    //Method show Information
    void showInfo(){
        System.out.println("-------Tiger-------");
        System.out.println("Name: "+getName());
        System.out.println("Food: "+ getFood());
        System.out.println("Moving: ");
        run();
        System.out.print("Resident: ");
        resident();
        System.out.print("Growing: ");
        grow();
    }
}
