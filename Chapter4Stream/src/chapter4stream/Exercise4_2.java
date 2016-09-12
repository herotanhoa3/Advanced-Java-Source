/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author hv
 */
public class Exercise4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        ArrayList list = new ArrayList(15);
       // list.add(random.ints(0,10));
        //list = 
        for(Object ar : list){
            list.add(random.ints(0,15));
        }
        //List<Integer> string1 = Arrays.asList(list);
    }
}
