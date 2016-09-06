package BigExercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 * @author Huynh Tan Hoa Version 1.0 Date: 6/9/2016
 */
public class main {

    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Student> listStudent;
    public static ArrayList<Subject> listSubjects;
    public static ArrayList<Class> listClass;
    public static ArrayList<Teacher> listTeacher;
    public static Teacher teacher;
    public static Student student;
    public static Class cla;
    public static Subject subject;
    public static void main(String[] args) throws IOException {
        //Create list Subject
            listSubjects = new ArrayList<>();
            subject = new Subject("1/1/2016", "Java Basic", 50, "1/3/2016");
            listSubjects.add(subject);
            subject = new Subject("2/3/2016", "Java Advanced", 70, "3/6/2016");
            listSubjects.add(subject);
            subject = new Subject("2/3/2016", "Linux Programing", 40, "3/6/2016");
            listSubjects.add(subject);
        //Create list Teacher
            listTeacher = new ArrayList<>();
            teacher = new Teacher(listSubjects.get(0), "Ngo Tat To", "ngotatto@gmail.com", "097289402");
            listTeacher.add(teacher);
            teacher = new Teacher(listSubjects.get(1), "To Hoai", "tohoai@gmail.com", "015782145");
            listTeacher.add(teacher);
            teacher = new Teacher(listSubjects.get(2), "Ly Bach", "lybach@gmail.com", "098563214");
            listTeacher.add(teacher);
        // Create list Class
            listClass = new ArrayList<>();
            cla = new Class("GCS Training", "T124183", "1/1/2016", "3/6/2016", 160, subject, teacher);
        // Create list student
            listStudent = new ArrayList<>();
            student = new Student("1/5/1994", cla, "Huynh Tan Hoa", "huynhtanhoa@gmail.com", "0965162900");
            listStudent.add(student);
            student = new Student("13/3/1992", cla, "Bui Truong Thi Tuan", "buitruongthituan@gmail.com", "0152468214");
            listStudent.add(student);
            student = new Student("11/2/1993", cla, "Tran Pham Hai Dang", "tranphamhaidang@gmail.com", "0949622990");
            listStudent.add(student);
        //
        System.out.println("----------Manage Class----------");
        boolean check = true;
        int choose = 0;
        while (check) {
            try {
                System.out.println("Choose show(1)/ add(2)/ edit(3)/ delete(4)/ check attendance(5) students");
                choose = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Wrong input!! please input from 1 to 5");
                continue;
            }
            check = false;
        }
        if(choose == 1){
            for(int i = 0; i< listStudent.size(); i++){
                System.out.println("Student ["+(i+1)+"] :");
                System.out.println("Name: "+ listStudent.get(i).getName());
                System.out.println("Date of birth: "+ listStudent.get(i).getDateOfBirth());
                System.out.println("Phone: "+ listStudent.get(i).getPhone());
                System.out.println("Email: "+ listStudent.get(i).getEmail());
                System.out.println("Class: "+ listStudent.get(i).getCla());
                System.out.println("Final Grade: "+ listStudent.get(i).getCla());
                System.out.println("------------------------------------------------");
            }
        }
    }

}
