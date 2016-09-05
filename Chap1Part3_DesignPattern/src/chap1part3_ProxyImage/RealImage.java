package chap1part3_ProxyImage;
/**
 * @author Huynh Tan Hoa
 * @version 1.0
 * @created 05-Sep-2016 
 */
public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+ fileName);
    }
    private void loadFromDisk(String fileName){
        System.out.println("Loading "+ fileName);
    }
}
