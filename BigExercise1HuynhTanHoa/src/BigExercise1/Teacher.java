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
public class Teacher extends Person {

    public ArrayList<Subject> getListSubjects() {
        return listSubjects;
    }

    public void setListSubjects(ArrayList<Subject> listSubjects) {
        this.listSubjects = listSubjects;
    }

    public Teacher(String name, String email, String phone) {
        super(name, email, phone);
    }

    public Teacher() {

    }

    public ArrayList<Subject> listSubjects;
}
