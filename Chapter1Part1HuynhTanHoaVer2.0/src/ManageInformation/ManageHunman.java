/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 *
 * @author hv
 */
public class ManageHunman {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Student> student;
    ArrayList<Teacher> teacher;
    Student stu;
    Teacher tea;
    Human hum;
    String str = "";
    boolean check;

    public ManageHunman() {
        student = new ArrayList<>();
        teacher = new ArrayList<>();
    }

    public void manageHuman() throws IOException {
        //hum.inputInfo();
        check = true;
        while (check) {
            try {
                System.out.println("Please choose Student(1) / Teacher(2)");
                str = input.readLine();
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input (1) or (2)");
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            if (str.equalsIgnoreCase("1")) {
                stu = new Student();
                stu.inputInfo();
                student.add(stu);
            } else if (str.equalsIgnoreCase("2")) {
                tea = new Teacher();
                tea.inputInfo();
                teacher.add(tea);
            } else {
                System.err.println("Input wrong format!! Please input (1) or (2)");
                continue;
            }
            check = false;
        }
        for (Student stu : student){
            System.out.println("Information of Student: ");
            stu.showInfo();
        }
        for (Teacher tea : teacher){
            System.out.println("Information of Teacher: ");
            tea.showInfo();
        }

    }
}
