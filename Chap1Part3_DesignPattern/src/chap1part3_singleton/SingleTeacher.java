
package chap1part3_singleton;

/**
 *
 * @author Huynh Tan Hoa
 * Version 1.0
 * Date: 1/9/2016
 */
public class SingleTeacher {

    private static SingleTeacher instance = new SingleTeacher();

    private SingleTeacher() {
    }

    public static SingleTeacher getInstance() {
        return instance;
    }

    public String shareDocument() {
        return "Tai lieu tham khai: \n - Chuong 1\n - Chuong 2\n - Chuong 3\n - Chuong 4\n ...";
    }
}
