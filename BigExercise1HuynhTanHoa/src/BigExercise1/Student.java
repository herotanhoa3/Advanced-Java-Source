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
