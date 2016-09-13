
package Exercise9_2;

/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class CD implements Comparable<CD> {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CD(String id, String name, String singer, int numOfSongs, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numOfSongs = numOfSongs;
        this.price = price;
    }

    public CD() {
    }
    public String id;
    public String name;
    public String singer;
    public int numOfSongs;
    public double price;

    @Override
    public int compareTo(CD o) {
        return (this.name).compareTo(o.name);
    }
    
    @Override
    public String toString() {
        return "id: " + this.id + "\nname: " + this.name + "\nsinger: " + this.singer + "\n"
                + "number of song: "
                + this.numOfSongs + "\nprice: " + this.price;
    }

}
