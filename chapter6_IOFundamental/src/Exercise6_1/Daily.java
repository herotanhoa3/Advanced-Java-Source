package Exercise6_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 14/9/2016
 */
public class Daily {

    public BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    //method Input stream data
    public String InputStream(String path) throws IOException {
        String nhatKy = "";
        String ngay;
        String noiDung;
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            while (true) {
                ngay = in.readUTF();
                noiDung = in.readUTF();
                nhatKy += ngay + "\n" + noiDung + "\n\n";
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return nhatKy;
    }
//method Ouput stream data

    public void OutputStream() throws IOException {
        Date today = new Date(System.currentTimeMillis());
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        String ngay = timeFormat.format(today.getTime());
        System.out.println("Add content of Daily: ");
        String noiDung = input.readLine();
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/Exercise6_1/daily.txt", true)))) {
            out.writeUTF(ngay);
            out.writeUTF(noiDung);
            System.out.println("Daily Writed!!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
