
package Exercise5_1;
/**
 *
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 13/9/2016
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadDemo T1 = new ThreadDemo("Google");
        T1.start();
        ThreadDemo T2 = new ThreadDemo("Yahoo");
        T2.start();
        ThreadDemo T3 = new ThreadDemo("Facebook");
        T3.start();
    }

}
