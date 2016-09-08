/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2_5;

import Exercise2_3.Student;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class ManageEmployee {

    ArrayList<Employee> listEmployees;
    Employee employee;

    //method manage Employee
    public void ManageEmployee() throws IOException {
        listEmployees = new ArrayList<>();
        employee = new Employee("T22222", "Ronaldinho Gauch", 25, 7000000);
        listEmployees.add(employee);
        employee = new Employee("T12345", "Micheal Phelp", 22, 9000000);
        listEmployees.add(employee);
        employee = new Employee("T98765", "Lionel Messi", 21, 8000000);
        listEmployees.add(employee);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("------------Manage Employyees------------");

        boolean flag = true;
        while (flag) {
            employee = new Employee();
            System.out.println("Choose (1), (2), (3), (4)");
            System.out.println("1). Show all employee");
            System.out.println("2). Add new employee");
            System.out.println("3). Search employee in List");
            System.out.println("4). Delete a employee");
            System.out.println("5). Exit");
            int choose = 0;
            try {
                choose = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Please input type integer");
                continue;
            }
            if (choose == 1) {
                System.out.println("--------List Employyees--------");
                Collections.sort(listEmployees);

                for (Employee employee : listEmployees) {

                    System.out.println(employee.toString());
                }
                System.out.println("------------------------------");
            } else if (choose == 2) {
                System.out.println("--------Add a new employee--------");
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
                        System.err.println("Please input type integer");
                        continue;
                    }
                    check = false;
                }
                check = true;
                while (check) {
                    try {
                        System.out.println("Input salary: ");
                        employee.setSalary(Double.parseDouble(input.readLine()));
                    } catch (Exception e) {
                        System.err.println("Please input type double");
                        continue;
                    }
                    check = false;
                }
                listEmployees.add(employee);

            } else if (choose == 3) {
                System.out.println("--------Search employee in List--------");
                System.out.println("Input id: ");
                String word = input.readLine();
                boolean flagCheck = false;
                Collections.sort(listEmployees);
                for (Employee employee : listEmployees) {
                    if (employee.getId().equalsIgnoreCase(word)) {
                        System.out.println("Have employee in List!!");
                        System.out.println(employee.toString());
                        flagCheck = true;
                    }
                }
                if (!flagCheck) {
                    System.out.println("Don't have employee in List");
                }
                System.out.println("------------------------------");
            } else if (choose == 4) {
                System.out.println("--------Delete a employee in List--------");
                System.out.println("Input ID want delete: ");
                String word = input.readLine();

                boolean flagCheck = false;
                Collections.sort(listEmployees);
                for (Employee employee : listEmployees) {
                    if (employee.getId().equalsIgnoreCase(word)) {
                        listEmployees.remove(employee);
                        System.out.println("Deleted!!");
                        flagCheck = true;
                        break;
                    }
                }
                if (!flagCheck) {
                    System.out.println("Don't have employee in List");
                }
                System.out.println("------------------------------");
            } else if (choose == 5) {
                flag = false;
                System.out.println("Goodbye!!!");
                break;
            } else {
                System.err.println("Please input 1 to 4");
                continue;
            }
        }

    }
}
