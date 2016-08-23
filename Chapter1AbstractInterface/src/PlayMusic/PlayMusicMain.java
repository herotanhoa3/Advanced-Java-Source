/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayMusic;

import com.sun.corba.se.pept.transport.InboundConnectionCache;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Huynh Tan Hoa
 * 23/08/2016
 * Version 1.0
 */
public class PlayMusicMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringedInstrument str ;
        NonStringedInstrument non ;
        System.out.println("Input name instrument: ");
        String name = input.readLine();
        System.out.println("Input manufactory: ");
        String manufactory = input.readLine();
        int choose = 0;
        boolean check;
        check = true;
        while (check) {
            try {
                System.out.println("Choose type instrument: Stringed(1)/ NonStringed(2)");
                choose = Integer.parseInt(input.readLine());
                if (choose == 1) {
                    System.out.println("Input number stringed: ");
                    int number = Integer.parseInt(input.readLine());
                    str =  new StringedInstrument(number, name, manufactory);
                    str.play();

                } else if (choose == 2) {
                    System.out.println("Input use way: ");
                    String useWay = input.readLine();
                    non =  new NonStringedInstrument(useWay, name, manufactory);
                    non.play();
                } else {
                    System.err.println("Please choose 1 to 2!!");
                    continue;
                }
                check = false;
            } catch (Exception e) {
                System.err.println("Error: Wrong format!!");
                System.err.println("Please choose 1 to 2!!");
                continue;
            }

        }

    }

}
