package com.dralong.design.test;

import com.dralong.design.decorator.Decorator;
import com.dralong.design.decorator.Source;
import com.dralong.design.decorator.Sourceable;

/**
 * 装饰模式测试
 * 
 * @author Jerry
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}
