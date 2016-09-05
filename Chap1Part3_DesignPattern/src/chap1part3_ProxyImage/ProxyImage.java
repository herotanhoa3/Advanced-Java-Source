
package chap1part3_ProxyImage;

/**
 * @author Huynh Tan Hoa
 * @version 1.0
 * @created 05-Sep-2016 
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;
    
    public ProxyImage(String fileName){
        this.fileName= fileName;
    }    
    @Override
    public void display() {
       if(realImage == null){
           realImage = new RealImage(fileName);
       }
       realImage.display();
    }
    
}
