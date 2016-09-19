
package Exercise2_ManageCD;
/**
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 19/09/2016
 */
public class CD {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumbersongs() {
        return numbersongs;
    }

    public void setNumbersongs(int numbersongs) {
        this.numbersongs = numbersongs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CD( String name, String singer, int numbersongs, double price) {
        this.name = name;
        this.singer = singer;
        this.numbersongs = numbersongs;
        this.price = price;
    }
    public CD(){
    }
    public String name;
    public String singer;
    public int numbersongs;
    public double price;
    
}
