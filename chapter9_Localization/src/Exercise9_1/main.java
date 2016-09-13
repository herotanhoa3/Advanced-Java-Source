/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise9_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author hv
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int choose = 0;
        boolean check = true;
        while (check) {
            try {
                System.out.println("Please choose language English(1)/ Vietnamese(2)");
                choose = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Wrong format! Please input 1 or 2");
                continue;
            }
            //choose English
            if (choose == 1) {
                String language = "en";
                String country = "US";
                Locale currentLocal = new Locale(language, country);

                ResourceBundle message;
                message = ResourceBundle.getBundle("Exercise9_1/resource_en_US", currentLocal);

                List<String> list = new ArrayList<>();
                Enumeration<String> keys = message.getKeys();
                while (keys.hasMoreElements()) {
                    String key = keys.nextElement();
                    String value = message.getString(key);
                    list.add(value);
                }
                //Print list
                for (Object object : list) {
                    System.out.println(" " + object);
                }
            //choose Vietnam
            } else if (choose == 2) {
                String language1 = "vi";
                String country1 = "VN";
                Locale currentLocal1 = new Locale(language1, country1);

                ResourceBundle message1;
                message1 = ResourceBundle.getBundle("Exercise9_1/resource_vi_VN", currentLocal1);

                List<String> list1 = new ArrayList<>();
                Enumeration<String> keys1 = message1.getKeys();
                while (keys1.hasMoreElements()) {
                    String key = keys1.nextElement();
                    String value = message1.getString(key);
                    list1.add(value);
                }
                //In list
                for (Object object : list1) {
                    System.out.println(" " + object);
                }
            } else {
                System.err.println("Input wrong format!! Plesse choose 1 or 2");
                continue;
            }
        }
    }

}
