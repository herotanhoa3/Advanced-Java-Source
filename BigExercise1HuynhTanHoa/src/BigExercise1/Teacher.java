package BigExercise1;

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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher(Subject subject, String name, String email, String phone) {
        super(name, email, phone);
        this.subject = subject;
    }

    public Teacher(Subject subject) {
        this.subject = subject;
    }

    public Teacher() {
    }
    public Subject subject;
}
