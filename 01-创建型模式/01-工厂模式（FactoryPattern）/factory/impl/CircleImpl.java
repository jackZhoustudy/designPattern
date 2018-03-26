package top.inson.pattern.factory.impl;

import top.inson.pattern.factory.IShape;
public class CircleImpl implements IShape{

	@Override
	public void draw() {
		System.out.println("这里是circle打印的");
	}

}
