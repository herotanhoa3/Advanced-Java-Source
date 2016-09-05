package chap1part3_DecoratorShape;
/**
 * @author Huynh Tan Hoa
 * @version 1.0
 * @created 05-Sep-2016 
 */
public abstract class ShapeDecorator implements IShape{
	protected IShape iShape;

	public ShapeDecorator(IShape iShape) {
		super();
		this.iShape = iShape;
	}

	public IShape getiShape() {
		return iShape;
	}

	public void setiShape(IShape iShape) {
		this.iShape = iShape;
	}
	//to draw a shape.
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return iShape.draw();
	}
}
