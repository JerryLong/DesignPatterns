package com.dralong.design.decorator;

/**
 * 
 * Title:Decorator
 *
 * Description: 装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例，
 * 
 * @author Jerry
 * @date 2016年3月25日下午5:31:37
 */
public class Decorator implements Sourceable {
	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}
}
