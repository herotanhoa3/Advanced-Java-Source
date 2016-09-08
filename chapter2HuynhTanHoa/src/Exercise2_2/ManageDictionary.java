
package Exercise2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class ManageDictionary {

    TreeMap listDictionary = new TreeMap();
    
    //method manage dictionary
    public void ManageDictionary() throws IOException {
        listDictionary.put("tree", "cai cay");
        listDictionary.put("school", "truong hoc");
        listDictionary.put("home", "ngoi nha");
        listDictionary.put("class", "lop hoc");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------Manage Dictionary------------");
        boolean flag = true;
        while (flag) {
            System.out.println("Choose (1), (2), (3), (4)");
            System.out.println("1). Show all Dictionary");
            System.out.println("2). Add new word");
            System.out.println("3). Search word in Dictionary");
            System.out.println("4). Delete a word");
            int choose = 0;
            try {
                choose = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Please input type integer");
                continue;
            }
            if (choose == 1) {
                System.out.println("--------My Dictionary--------");
                for (Object key : listDictionary.keySet()) {
                    Object value = listDictionary.get(key);
                    System.out.println(key + ": " + value);
                }
                System.out.println("------------------------------");
            }
            if (choose == 2) {
                System.out.println("--------Add a new word--------");
                System.out.println("Input word: ");
                String word = input.readLine();
                System.out.println("Input meaning: ");
                String meaning = input.readLine();
                listDictionary.put(word, meaning);
                System.out.println("------------------------------");
            }
            if (choose == 3) {
                System.out.println("--------Search word in Dictionary--------");
                System.out.println("Input word: ");
                String word = input.readLine();
                boolean result = listDictionary.containsKey(word);
                if (result == true) {
                    System.out.println("Have word in Dictionary!!");

                    System.out.println(word + ": " + listDictionary.get(word));
                } else {
                    System.out.println("Don't have word in Dictionary");
                }
                System.out.println("------------------------------");
            }
            if (choose == 4) {
                System.out.println("--------Delete a word in Dictionary--------");
                System.out.println("Input word: ");
                String word = input.readLine();
                boolean result = listDictionary.containsKey(word);
                if (result == true) {
                    System.out.println("Have word in Dictionary!!");

                    listDictionary.remove(word);
                    System.out.println("Deleted !!");
                } else {
                    System.out.println("Don't have word in Dictionary");
                }
                System.out.println("------------------------------");
            } else if (choose == 5) {
                flag = false;
                System.out.println("Goodbye!!!");
                break;
            } else {
                System.err.println("Please input 1 to 4");
                continue;
            }
        }
    }

}
