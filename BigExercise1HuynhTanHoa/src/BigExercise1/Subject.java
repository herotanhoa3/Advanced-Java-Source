package BigExercise1;

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
public class Subject {

    public Subject(String dateStart, String name, int sumLesson, String dateEnd, Teacher teacher) {
        this.dateStart = dateStart;
        this.name = name;
        this.sumLesson = sumLesson;
        this.dateEnd = dateEnd;
        this.teacher = teacher;
    }

    public Subject() {
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumLesson() {
        return sumLesson;
    }

    public void setSumLesson(int sumLesson) {
        this.sumLesson = sumLesson;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public String dateStart;
    public String name;
    private int sumLesson;
    public String dateEnd;
    public Teacher teacher;
}
