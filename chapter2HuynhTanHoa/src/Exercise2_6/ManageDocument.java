
package Exercise2_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.StringTokenizer;
import jdk.nashorn.internal.objects.NativeRegExp;

/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class ManageDocument {

    private HashMap<String, Integer> listDocument;

    public ManageDocument() {
        this.listDocument = new HashMap<String, Integer>();
    }
    public BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void ManageDocument() throws IOException {
        System.out.println("Input document: ");
        String document = input.readLine();
        StringTokenizer multi = new StringTokenizer(document);
        while (multi.hasMoreTokens()) {
            String word = multi.nextToken();
            if (this.listDocument.containsKey(word) == true) {
                int oldValue = this.listDocument.get(word);
                this.listDocument.replace(word, oldValue + 1);
            } else {
                this.listDocument.put(word, 1);
            }
        }
    }
    public void show() {
        System.out.println("== Tokens in document ==");
        for (Object object : listDocument.keySet()) {
            System.out.print("["+object+"]");
            System.out.println(" "+this.listDocument.get(object));
        }
    }
}
