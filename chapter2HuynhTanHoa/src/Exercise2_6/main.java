


import Exercise2_6.ManageDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ManageDocument manage = new ManageDocument();
        manage.ManageDocument();
        manage.show();
        
    }
    
}
