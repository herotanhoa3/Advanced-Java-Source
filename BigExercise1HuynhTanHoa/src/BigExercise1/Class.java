package BigExercise1;

import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hv
 */
public class Class {

    public Class(String name, String id, String dateStart, String dateEnd, int sumLesson) {
        this.name = name;
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.sumLesson = sumLesson;
    }

    public Class() {
    }
    public String name;
    public String id;
    public String dateStart;
    public String dateEnd;
    public int sumLesson;
    public ArrayList<Student> listStudent;
    public ArrayList<Subject> listSubjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getSumLesson() {
        return sumLesson;
    }

    public void setSumLesson(int sumLesson) {
        this.sumLesson = sumLesson;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public ArrayList<Subject> getListSubjects() {
        return listSubjects;
    }

    public void setListSubjects(ArrayList<Subject> listSubjects) {
        this.listSubjects = listSubjects;
    }

}
