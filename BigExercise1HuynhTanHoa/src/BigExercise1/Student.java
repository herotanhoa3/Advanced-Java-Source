package BigExercise1;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hv
 */
public class Student extends Person {

    public String dateOfBirth;

    public Student(String dateOfBirth, String name, String email, String phone) {
        super(name, email, phone);
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Student(){
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
