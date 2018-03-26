package top.inson.pattern.factory;

import top.inson.pattern.factory.impl.CircleImpl;
import top.inson.pattern.factory.impl.RectangleImpl;
import top.inson.pattern.factory.impl.SquareImpl;
/**
 * ¹¤³§
 * @author Administrator
 */
public class ShapeFactory {
	
	public IShape getShape(String shapeType){
		if(shapeType == null)
			return null;
		if(shapeType.equalsIgnoreCase("rectangle")){
			return new RectangleImpl();
		}else if(shapeType.equalsIgnoreCase("square")){
			return new SquareImpl();
		}else if(shapeType.equalsIgnoreCase("circle")){
			return new CircleImpl();
		}
		return null;
	}
}
