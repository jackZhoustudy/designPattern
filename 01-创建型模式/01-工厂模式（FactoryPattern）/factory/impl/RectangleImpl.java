package top.inson.pattern.factory.impl;

import top.inson.pattern.factory.IShape;

public class RectangleImpl implements IShape{

	@Override
	public void draw() {
		System.out.println("这是rectangle打印的");
	}

}
