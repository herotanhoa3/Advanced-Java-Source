
package chap1part3_FactoryShape;

/**
 *
 * @author Huynh Tan Hoa
 * Version 1.0
 * Date: 1/9/2016
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType== null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
