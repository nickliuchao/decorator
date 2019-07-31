package com.test.decorator;

/**
 * 装修基本类
 * @author admin
 *
 */
public class Decorator implements IDecorator{

	/**
	 * 基本实现方法
	 */
	public void decorate() {
		System.out.println("水电装修、天地板以及粉刷墙。。。");
	}

}