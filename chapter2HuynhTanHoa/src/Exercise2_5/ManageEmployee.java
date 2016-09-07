/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2_5;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author hv
 */
public class ManageEmployee {

    Map listEmployees = new HashMap();

    public void ManageEmployee() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------Manage Employee------------");
        boolean flag = true;
        while (flag) {
            System.out.println("Do you want add CD? (y) or (n)");
            String choose = input.readLine();
            if (choose.equalsIgnoreCase("y")) {
                Employee employee = new Employee();
                System.out.println("Input id: ");
                employee.setId(input.readLine());
                System.out.println("Input name: ");
                employee.setName(input.readLine());
                boolean check = true;
                while (check) {
                    try {
                        System.out.println("Input age: ");
                        employee.setAge(Integer.parseInt(input.readLine()));
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
                        employee.setSalary(Double.parseDouble(input.readLine()));
                    } catch (Exception e) {
                        System.err.println("Wrong input! Input type double");
                        continue;
                    }
                    check = false;
                }
//                listEmployees.put(employee.getId(), employee);
//              
//            } else {
//                System.out.println("------------Manage CD------------");
//                for (Map cd : listEmployees) {
//                    System.out.println(cd.toString());
//                    System.out.println("-----------------------------");
//                }
//                double sum = 0;
//                for (CD cd : listEmployees) {
//                    sum += cd.getPrice();
//                }
//                System.out.println("Sum of CD: " + sum);
//                flag = false;
////            }
//            }
        }
    }
}
}
