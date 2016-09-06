package BigExercise1;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Huynh Tan Hoa 
 * @Version 1.0 
 * @Date: 6/9/2016
 */
public class Subject {

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

    public ArrayList<Teacher> getListTeacher() {
        return listTeacher;
    }

    public void setListTeacher(ArrayList<Teacher> listTeacher) {
        this.listTeacher = listTeacher;
    }

    public Subject(String dateStart, String name, int sumLesson, String dateEnd) {
        this.dateStart = dateStart;
        this.name = name;
        this.sumLesson = sumLesson;
        this.dateEnd = dateEnd;
    }
    public Subject(){
    }
    

    public String dateStart;
    public String name;
    private int sumLesson;
    public String dateEnd;
    
    public ArrayList<Teacher> listTeacher;
    //Constructor Subject
}
