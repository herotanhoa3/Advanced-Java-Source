package Exercise2_ManageCD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

/**
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 19/09/2016
 */
public class main {

    public static ManageController manage = new ManageController();
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws SQLException, ClassNotFoundException, UnsupportedEncodingException, IOException {

        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("-------------Manage CD-------------");
            System.out.println("1) Add new cd");
            System.out.println("2) Search cd");
            System.out.println("3) Update cd");
            System.out.println("4) Delete cd");
            try {
                choose = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Please choose 1 to 4");
                continue;
            }
            manage.checkChoose(choose);
            System.out.println("Do you want continue? 'y' or 'n'");
            String ans = input.readLine();
            if (ans.equalsIgnoreCase("y")) {
                continue;
            } else {
                System.out.println("Goodbye!!!!");
                break;
            }
        }

    }

}
