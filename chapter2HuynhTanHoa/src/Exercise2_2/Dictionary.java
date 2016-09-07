/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2_2;

/**
 *
 * @author hv
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
