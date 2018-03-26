package top.inson.pattern.factory;

import org.junit.Test;

public class TestFactory {
	@Test
	public void testOne(){
		ShapeFactory shapeFactory = new ShapeFactory();
		IShape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		IShape square = shapeFactory.getShape("square");
		square.draw();
		
		IShape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
	}
}
