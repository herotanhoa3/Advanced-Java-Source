
package chap1part3_singleton;

/**
 *
 * @author Huynh Tan Hoa
 * Version 1.0
 * Date: 1/9/2016
 */
public class Chap1Part3_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleTeacher object = SingleTeacher.getInstance();
        System.out.println(object.shareDocument());
    }
    
}
