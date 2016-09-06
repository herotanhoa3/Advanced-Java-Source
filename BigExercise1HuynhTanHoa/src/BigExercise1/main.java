package BigExercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

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
        //Create list subject
        listSubjects = new ArrayList<>();
        subject = new Subject("1/1/2016", "Java Basic", 50, "1/3/2016");
        listSubjects.add(subject);
        subject = new Subject("2/3/2016", "Java Advanced", 70, "3/6/2016");
        listSubjects.add(subject);
        subject = new Subject("2/3/2016", "Linux Programing", 40, "3/6/2016");
        listSubjects.add(subject);
        //Create list Teacher
        listTeacher = new ArrayList<>();
        teacher = new Teacher("Ngo Tat To", "ngotatto@gmail.com", "097289402");
        listTeacher.add(teacher);
        teacher = new Teacher("To Hoai", "tohoai@gmail.com", "015782145");
        listTeacher.add(teacher);
        teacher = new Teacher("Ly Bach", "lybach@gmail.com", "098563214");
        listTeacher.add(teacher);
        // Create list Class
        listClass = new ArrayList<>();
        cla = new Class("GCS Training", "T124183", "1/1/2016", "3/6/2016", 160);

        // Create list student
        listStudent = new ArrayList<>();
        student = new Student("1/5/1994", "Huynh Tan Hoa", "huynhtanhoa@gmail.com", "0965162900");
        MarkSession markSession = new MarkSession(10, 10, 10);
        MarkSession markSession1 = new MarkSession(8, 8, 8);
        MarkSession markSession2 = new MarkSession(9, 9, 9);
        List<MarkSession> listJava_A = new ArrayList<>();
        listJava_A.add(markSession);
        listJava_A.add(markSession1);
        listJava_A.add(markSession2);
        FinalGrade finalGrade = new FinalGrade(listJava_A, new MarkExam(9, 9));
        student.markMultiChoice = 9;
        student.markPractice = 9;
        student.finalMark = finalGrade.calFinalGrade();
        student.allSessionMark = finalGrade.calAllSessionMark();
        listStudent.add(student);
        student = new Student("13/3/1992", "Bui Truong Thi Tuan", "buitruongthituan@gmail.com", "0152468214");
        MarkSession markSession3 = new MarkSession(10, 9, 8);
        MarkSession markSession4 = new MarkSession(7, 6, 5);
        MarkSession markSession5 = new MarkSession(8, 9, 8);
        List<MarkSession> listJava_B = new ArrayList<>();
        listJava_B.add(markSession3);
        listJava_B.add(markSession4);
        listJava_B.add(markSession5);
        FinalGrade finalGrade1 = new FinalGrade(listJava_B, new MarkExam(6, 9));
        student.markMultiChoice = 6;
        student.markPractice = 9;
        student.allSessionMark = finalGrade1.calAllSessionMark();
        student.finalMark = finalGrade1.calFinalGrade();
        listStudent.add(student);
        student = new Student("11/2/1993", "Tran Pham Hai Dang", "tranphamhaidang@gmail.com", "0949622990");
        MarkSession markSession6 = new MarkSession(10, 9, 8);
        MarkSession markSession7 = new MarkSession(8, 9, 8);
        MarkSession markSession8 = new MarkSession(8, 9, 8);
        List<MarkSession> listJava_C = new ArrayList<>();
        listJava_C.add(markSession6);
        listJava_C.add(markSession7);
        listJava_C.add(markSession8);
        FinalGrade finalGrade2 = new FinalGrade(listJava_B, new MarkExam(9, 8));
        student.markMultiChoice = 9;
        student.markPractice = 8;
        student.allSessionMark = finalGrade2.calAllSessionMark();
        student.finalMark = finalGrade2.calFinalGrade();
        listStudent.add(student);
        // calculate Mark student 1

        // calculate Mark student 2
        //
        System.out.println("----------Manage Class----------");
        boolean check = true;
        int choose = 0;
        while (check) {
            try {
                System.out.println("Choose (1), (2), (3), (4), (5), (6)");
                System.out.println("1). Show Information Class");
                System.out.println("2). Show Information Subject ");
                System.out.println("3). Show Information Student ");
                System.out.println("4). Show Information Teacher ");
                System.out.println("5). Show Mark Table of Student ");
                System.out.println("6). Add new a Student ");
                choose = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Wrong input!! please input from 1 to 6");
                continue;
            }
            if (choose == 1) {
                System.out.println("-------Show Information Class-------");
                System.out.println("Name class: " + cla.getName());
                System.out.println("ID: " + cla.getId());
                System.out.println("Date start: " + cla.getDateStart());
                System.out.println("Date end: " + cla.getDateEnd());
                System.out.println("Number of subjects: " + listSubjects.size());
                System.out.println("Number of teacher: " + listTeacher.size());
                System.out.println("Number of student: " + listStudent.size());
                System.out.println("-----------------------------------------");
            } else if (choose == 2) {
                System.out.println("-------Show Information Subject-------");
                System.out.println("Number of Subject: " + listSubjects.size());
                System.out.println("Include: ");
                for (Subject subject : listSubjects) {
                    System.out.println("Name subject: " + subject.getName());
                    System.out.println("Sum lessons: " + subject.getSumLesson());
                    System.out.println("Date start: " + subject.getDateStart());
                    System.out.println("Date end: " + subject.getDateEnd());
                    System.out.println("Teacher: " + listTeacher.get(0).getName());
                    System.out.println("==================================");
                }
            } else if (choose == 3) {
                System.out.println("-------Show Information Student-------");
                System.out.println("Number of Student: " + listStudent.size());
                System.out.println("Include: ");
                for (Student student : listStudent) {
                    System.out.println("Name student: " + student.getName());
                    System.out.println("Email: " + student.getEmail());
                    System.out.println("Phone: " + student.getPhone());
                    System.out.println("Date of birth: " + student.getDateOfBirth());
                    System.out.println("Final Mark: " + student.finalMark);
                    System.out.println("==================================");
                }
            } else if (choose == 4) {
                System.out.println("-------Show Information Teacher-------");
                System.out.println("Number of Teacher: " + listTeacher.size());
                System.out.println("Include: ");
                for (Teacher teacher : listTeacher) {
                    System.out.println("Name student: " + teacher.getName());
                    System.out.println("Email: " + teacher.getEmail());
                    System.out.println("Phone: " + teacher.getPhone());
                    System.out.println("List subject: " + listSubjects.get(0).getName());
                    System.out.println("==================================");
                }
            } else if (choose == 5) {
                System.out.println("-------Show Mark Table-------");
                for (Student student : listStudent) {
                    System.out.println("-------Table Mark -------");
                    System.out.println("Name student: " + student.getName());
                    System.out.println("Mark of Multichoice: " + student.markMultiChoice);
                    System.out.println("Mark of Practice: " + student.markPractice);
                    System.out.println("Sum Individual: " + student.allSessionMark);
                    System.out.println("Final Mark: " + student.finalMark);
                    System.out.println("==================================");
                }
            } else if (choose == 6) {
                System.out.println("-------Add new a Student-------");
                //listStudent = new ArrayList<>();
                student = new Student();
                System.out.println("Input name a student: ");
                student.setName(input.readLine());
                System.out.println("Input date of birth: ");
                student.setDateOfBirth(input.readLine());
                System.out.println("Input email: ");
                student.setEmail(input.readLine());
                System.out.println("Input phone: ");
                student.setPhone(input.readLine());
                ///
                boolean flag = true;
                int sesson1 = 0;
                int sesson2 = 0;
                int sesson3 = 0;
                int sesson4 = 0;
                int sesson5 = 0;
                int sesson6 = 0;
                int multiple = 0;
                int practice = 0;
                while (flag) {
                    try {
                        System.out.println("Input mark sesson 1: ");
                        sesson1 = Integer.parseInt(input.readLine());
                    } catch (Exception e) {
                        System.err.println("Wrong format!! Please input integer!!");
                        continue;
                    }
                    flag = false;
                }
                flag = true;
                while (flag) {
                    try {
                        System.out.println("Input mark sesson 2: ");
                        sesson2 = Integer.parseInt(input.readLine());
                    } catch (Exception e) {
                        System.err.println("Wrong format!! Please input integer!!");
                        continue;
                    }
                    flag = false;
                }
                flag = true;
                while (flag) {
                    try {
                        System.out.println("Input mark sesson 3: ");
                        sesson3 = Integer.parseInt(input.readLine());
                    } catch (Exception e) {
                        System.err.println("Wrong format!! Please input integer!!");
                        continue;
                    }
                    flag = false;
                }
                flag = true;
                while (flag) {
                    try {
                        System.out.println("Input mark sesson 4: ");
                        sesson4 = Integer.parseInt(input.readLine());
                    } catch (Exception e) {
                        System.err.println("Wrong format!! Please input integer!!");
                        continue;
                    }
                    flag = false;
                }
                flag = true;
                while (flag) {
                    try {
                        System.out.println("Input mark sesson 5: ");
                        sesson5 = Integer.parseInt(input.readLine());
                    } catch (Exception e) {
                        System.err.println("Wrong format!! Please input integer!!");
                        continue;
                    }
                    flag = false;
                }
                flag = true;
                while (flag) {
                    try {
                        System.out.println("Input mark sesson 6: ");
                        sesson6 = Integer.parseInt(input.readLine());
                    } catch (Exception e) {
                        System.err.println("Wrong format!! Please input integer!!");
                        continue;
                    }
                    flag = false;
                }
                flag = true;
                while (flag) {
                    try {
                        System.out.println("Input mark Multiplechoice: ");
                        multiple = Integer.parseInt(input.readLine());
                    } catch (Exception e) {
                        System.err.println("Wrong format!! Please input integer!!");
                        continue;
                    }
                    flag = false;
                }
                flag = true;
                while (flag) {
                    try {
                        System.out.println("Input mark Practice: ");
                        practice = Integer.parseInt(input.readLine());
                    } catch (Exception e) {
                        System.err.println("Wrong format!! Please input integer!!");
                        continue;
                    }
                    flag = false;
                }
                MarkSession markSession10 = new MarkSession(sesson1, sesson2, sesson3);
                MarkSession markSession11 = new MarkSession(sesson4, sesson5, sesson6);
                List<MarkSession> listJava_D = new ArrayList<>();
                listJava_D.add(markSession10);
                listJava_D.add(markSession11);
                FinalGrade finalGrade4 = new FinalGrade(listJava_D, new MarkExam(multiple, practice));
                student.markMultiChoice = multiple;
                student.markPractice = practice;
                student.finalMark = finalGrade4.calFinalGrade();
                student.allSessionMark = finalGrade4.calAllSessionMark();
                listStudent.add(student);
            } else {
                System.err.println("Wrong input!! please input from 1 to 6");
            }
            //check = false;
        }

    }

}
