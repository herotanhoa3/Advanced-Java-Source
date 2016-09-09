package Exercise3_2;

import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class Exercise3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> amounts = Arrays.asList(new Integer[] {2, 3, 5, 7});
        int price = 5200;
        amounts.forEach(n -> System.out.println("Thanh tien= "+n*price));
    }
    
}
