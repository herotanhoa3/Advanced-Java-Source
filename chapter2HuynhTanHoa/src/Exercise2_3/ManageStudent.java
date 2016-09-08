/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

/**
 *
 * @author hv
 */
public class ManageStudent {

    TreeMap listTreeMap;
    Student student;

    // method manage student
    public void ManageStudent() throws IOException {
        listTreeMap = new TreeMap();
        student = new Student("T124183", "Huynh Tan Hoa", 22, "1/5/1994");
        listTreeMap.put(student.id, student);
        student = new Student("T243543", "Bui Truong Minh Tuan", 24, "2/7/1992");
        listTreeMap.put(student.id, student);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("------------Manage Student------------");

        boolean flag = true;
        while (flag) {
            System.out.println("Choose (1), (2), (3), (4)");
            System.out.println("1). Show all Student");
            System.out.println("2). Add new student");
            System.out.println("3). Search student in List");
            System.out.println("4). Delete a student");
            int choose = Integer.parseInt(input.readLine());
            if (choose == 1) {
                System.out.println("--------List Student--------");
                for (Object key : listTreeMap.keySet()) {
                    Object student = listTreeMap.get(key);
                    System.out.println(student.toString());
                }
                System.out.println("------------------------------");
            }
            if (choose == 2) {
                student = new Student();
                System.out.println("--------Add a new student--------");
                System.out.println("Input id: ");
                student.setId(input.readLine());
                System.out.println("Input name: ");
                student.setName(input.readLine());
                boolean check = true;
                while (check) {
                    try {
                        System.out.println("Input age: ");
                        student.setAge(Integer.parseInt(input.readLine()));
                    } catch (Exception e) {
                        System.err.println("Please input type integer");
                        continue;
                    }
                    check = false;
                }
                System.out.println("Input date of birth: ");
                student.setPlaceOfBirth(input.readLine());
                listTreeMap.put(student.getId(), student);
            }
            if(choose == 3){
                System.out.println("--------Search student in List--------");
                System.out.println("Input id: ");
                String word = input.readLine();
                boolean result = listTreeMap.containsKey(word);
                if(result == true){
                    System.out.println("Have student in List!!");
                    
                    System.out.println(listTreeMap.get(word));
                }else{
                    System.out.println("Don't have student in List");
                }
                System.out.println("------------------------------");
            }
            if(choose ==4){
                System.out.println("--------Delete a student in List--------");
                System.out.println("Input ID want delete: ");
                String word = input.readLine();
                boolean result = listTreeMap.containsKey(word);
                if(result == true){
                    System.out.println("Have student in List!!");
                    
                    listTreeMap.remove(word);
                    System.out.println("Deleted !!");
                }else{
                    System.out.println("Don't have student in List");
                }
                System.out.println("------------------------------");
            }
        }
    }
}
