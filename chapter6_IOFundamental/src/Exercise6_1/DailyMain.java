package Exercise6_1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import javafx.scene.shape.Path;

/**
 *
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 14/9/2016
 */
public class DailyMain {

    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String p1 = "src/Exercise6_1/daily.txt";
        String p2 = "src/Exercise6_1/txtNoiDung.txt";
        Daily daily = new Daily();
        boolean check = true;
        int choose = 0;
        while (check) {
            try {
                System.out.println("Do you want Read(1)/ Write(2)/ Exit(3)");
                choose = Integer.parseInt(input.readLine());
                if (choose == 1) {
                    System.out.println("" + daily.InputStream(p1));
                    continue;

                } else if (choose == 2) {
                    daily.OutputStream();
                    continue;
                } else if (choose == 3) {
                    System.out.println("Goodbye!!!");
                    check = false;
                    break;
                } else {
                    System.err.println("Please input 1 or 2");
                    continue;
                }
            } catch (Exception e) {
                System.err.println("Please input 1 or 2");
                continue;
            }
        }

    }
}
