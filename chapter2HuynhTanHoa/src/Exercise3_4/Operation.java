
package Exercise3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class Operation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap a: ");
        int a = Integer.parseInt(input.readLine());
        System.out.println("Nhap b: ");
        int b = Integer.parseInt(input.readLine());
        Operator op1 = (x1,x2) -> x1+x2;
        System.out.println("Tong = "+op1.operator(a, b));
        Operator op2 =(x1,x2) -> x1-x2;
        System.out.println("Hieu = "+op2.operator(a, b));
        Operator op3 =(x1,x2) -> x1*x2;
        System.out.println("Tich = "+op3.operator(a, b));
        Operator op4 =(x1,x2) -> x1/x2;
        System.out.println("Thuong = "+op4.operator(a, b));
    }
    interface Operator{
        public Integer operator(Integer operand1, Integer operand2);
    }
}
