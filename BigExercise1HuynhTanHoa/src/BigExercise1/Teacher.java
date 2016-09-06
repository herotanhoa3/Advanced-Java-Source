package BigExercise1;

import java.util.ArrayList;

/**
 * @author Huynh Tan Hoa 
 * @Version 1.0 
 * @Date: 6/9/2016
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
