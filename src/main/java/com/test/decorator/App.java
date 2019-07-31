package com.test.decorator;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args ) throws InterruptedException, IOException
//    {
////    	IDecorator decorator = new Decorator();
////    	IDecorator curtainDecorator = new CurtainDecorator(decorator);
////    	curtainDecorator.decorate();
//        
//    	
//    }
	
	public static void alloc() {
		byte[] b = new byte[2];
		b[0] = 1;
	}
 
	public static void main(String[] args) {
		for(int i=0; i<1000000; i++) {
			add1(1,2,3,4);
		}
		
	}
	
	private static int add1(int x1, int x2, int x3, int x4) {
	    return add2(x1, x2) + add2(x3, x4);
	}
	private static int add2(int x1, int x2) {
	    return x1 + x2;
	}
	
}
