package Exercise2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class ManageCD {

    ArrayList<CD> listCD = new ArrayList<>();
    String name;

    public void ManageCD() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("------------Manage CD------------");

        boolean flag = true;
        while (flag) {
            System.out.println("Do you want add CD? (y) or (n)");
            String choose = input.readLine();
            if (choose.equalsIgnoreCase("y")) {
                CD cd = new CD();
                System.out.println("Input id: ");
                cd.setId(input.readLine());
                System.out.println("Input name: ");
                cd.setName(input.readLine());
                System.out.println("Input singer: ");
                cd.setSinger(input.readLine());
                boolean check = true;
                while (check) {
                    try {
                        System.out.println("Input number of song: ");
                        cd.setNumOfSongs(Integer.parseInt(input.readLine()));
                    } catch (Exception e) {
                        System.err.println("Wrong input! Input type integer");
                        continue;
                    }
                    check = false;
                }
                check = true;
                while (check) {
                    try {
                        System.out.println("Input price: ");
                        cd.setPrice(Double.parseDouble(input.readLine()));
                    } catch (Exception e) {
                        System.err.println("Wrong input! Input type double");
                        continue;
                    }
                    check = false;
                }
                listCD.add(cd);
                Collections.sort(listCD);
            } else {
                System.out.println("------------Manage CD------------");
                for (CD cd : listCD) {
                    System.out.println(cd.toString());
                    System.out.println("-----------------------------");
                }
                double sum = 0;
                for (CD cd : listCD) {
                    sum += cd.getPrice();
                }
                System.out.println("Sum of CD: " + sum);
                flag = false;
            }
        }
    }

}
