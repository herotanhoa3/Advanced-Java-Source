/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Huynh Tan Hoa
 * 23/08/2016
 * Version 1.0
 */
public class ManageZoo {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Bird> ListBird;
    ArrayList<Fish> ListFish;
    ArrayList<Tiger> ListTiger;
    ArrayList<Boa> ListBoa;
    Bird bird;
    Fish fish;
    Tiger tiger;
    Boa boa;

    public ManageZoo() {
        ListBird = new ArrayList<Bird>();
        ListFish = new ArrayList<Fish>();
        ListTiger = new ArrayList<Tiger>();
        ListBoa = new ArrayList<Boa>();
    }
    //Method Manage Zoo
    public void ManageZoo() throws IOException {

        boolean check;
        check = true;
        while (check) {
            try {
                System.out.println("Input name: ");
                String name = input.readLine();
                System.out.println("Input food: ");
                String food = input.readLine();
                System.out.println("Choose type animal Bird(1)/ Fish(2)/ Tiger(3)/ Boa(4)");
                int choose = Integer.parseInt(input.readLine());
                if (choose == 1) {
                    bird = new Bird(name, food);
                    //bird.showInfo();
                    ListBird.add(bird);
                } else if (choose == 2) {
                    fish = new Fish(name, food);
                    //fish.showInfo();
                    ListFish.add(fish);

                } else if (choose == 3) {
                    tiger = new Tiger(name, food);
                    //tiger.showInfo();
                    ListTiger.add(tiger);
                } else if (choose == 3) {
                    boa = new Boa(name, food);
                    //boa.showInfo();
                    ListBoa.add(boa);
                } else {
                    System.err.println("Please choose 1 to 4!!");
                    continue;
                }
                System.out.print("Do you want to add Book 'Y' or 'N' ? ");
                String answer = input.readLine();
                if (answer.equalsIgnoreCase("y")) {
                    continue;
                }
                System.out.println("Information of Bird: ");
                for (Bird bird : ListBird) {
                    bird.showInfo();
                }
                for (Fish fish : ListFish) {
                    fish.showInfo();
                }
                for (Tiger tiger : ListTiger) {
                    tiger.showInfo();
                }
                for (Boa boa : ListBoa) {
                    boa.showInfo();
                }
                check = false;
            } catch (Exception e) {
                System.err.println("Error: Wrong format!!");
                System.err.println("Please choose 1, 2, 3 or 4!!");
                continue;
            }
        }
    }

//    
}
