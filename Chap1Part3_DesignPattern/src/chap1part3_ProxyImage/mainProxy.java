package chap1part3_ProxyImage;

/**
 * @author Huynh Tan Hoa
 * @version 1.0
 * @created 05-Sep-2016
 */
public class mainProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println("");
        //img
    }

}
