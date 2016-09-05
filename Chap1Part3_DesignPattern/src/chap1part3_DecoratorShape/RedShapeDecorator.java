package chap1part3_DecoratorShape;
/**
 * @author Huynh Tan Hoa
 * @version 1.0
 * @created 05-Sep-2016 
 */
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(IShape iShape) {
		super(iShape);
		// TODO Auto-generated constructor stub
	}
	//to draw a shape with red border.
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return this.iShape.draw() + " and " +setRedBorder(iShape);
	}
	//to set red border.
	private String setRedBorder(IShape iShape) {
		// TODO Auto-generated method stub
		return "Border Color: Red.";
	}
}
