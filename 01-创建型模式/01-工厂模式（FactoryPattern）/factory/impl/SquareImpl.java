package top.inson.pattern.factory.impl;

import top.inson.pattern.factory.IShape;

public class SquareImpl implements IShape{

	@Override
	public void draw() {
		System.out.println("这里是Square打印的");
	}

}
