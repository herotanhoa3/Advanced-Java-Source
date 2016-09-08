
package Exercise2_2;

/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class Dictionary {

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public Dictionary(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }
    public Dictionary(){
    
    }
    public String word;
    public String meaning;
}
