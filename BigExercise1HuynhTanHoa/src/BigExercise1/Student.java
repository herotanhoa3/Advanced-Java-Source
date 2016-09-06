package BigExercise1;

import java.util.ArrayList;

/**
 * @author Huynh Tan Hoa 
 * @Version 1.0 
 * @Date: 6/9/2016
 */
public class Student extends Person {

    public double getMarkMultiChoice() {
        return markMultiChoice;
    }

    public void setMarkMultiChoice(double markMultiChoice) {
        this.markMultiChoice = markMultiChoice;
    }

    public double getMarkPractice() {
        return markPractice;
    }

    public void setMarkPractice(double markPractice) {
        this.markPractice = markPractice;
    }

    public double getAllSessionMark() {
        return allSessionMark;
    }

    public void setAllSessionMark(double allSessionMark) {
        this.allSessionMark = allSessionMark;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }
    public double markMultiChoice;
    public double markPractice;
    public String dateOfBirth;
    public double finalMark;
    public double allSessionMark;
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
