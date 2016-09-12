/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author hv
 */
public class Exercise4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> string1 = Arrays.asList("Dzmitry", "John", "Bob", "Na", "",
                "King", "aKill", "Dead", "Lose", "happy",
                "Over", "Ne", "", "Arena", "Ultimate");
        Stream<List<String>> stream1 = Stream.of(string1);
        stream1.forEach(System.out::print);
        //Element have value is null
        int count =(int) string1.stream().filter(string-> string.isEmpty()).count();
        System.out.println("\nElement have value is null= "+count);
        //Number element have length
        int count1 =(int) string1.stream().filter(string-> string.length()>=5).count();
        System.out.println("\nNumber element have length >=5 = "+count1);
        //Number element have value start 'a'
        int count2 =(int) string1.stream().filter(string-> string.startsWith("a", 0)).count();
        System.out.println("\nNumber element have value start 'a' = "+count2);
        //Element have value exactly 'happy'
        int count3 =(int) string1.stream().filter(string-> string.matches("happy")).count();
        System.out.println("\nElement have value exactly 'happy' = "+count3);
        //Filtered List 2
        List<String> string2 = string1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("\nFiltered List 2: "+string2);
        
        //Filtered List 3
        List<String> string3 = string1.stream().filter(string -> string.length() >=3 && string.length()<=6).collect(Collectors.toList());
        String merged = string3.stream().collect(Collectors.joining(", "));
        System.out.println("\nFiltered List 3: "+merged);
        
        //Filtered List 4
         List<String> string4 = string1.stream().map(string -> string+"happy").collect(Collectors.toList());
        System.out.println("\nFiltered List 4: "+string4);
    }

}
