package com.dralong.design.factory;

import com.dralong.design.factory.impl.FactoryMail;
import com.dralong.design.factory.impl.FactorySms;
import com.dralong.design.factory.interfaces.FactoryInterface;

/**
 * 
 * Title:Factory
 *
 * Description:
 * 
 * @author Jerry
 * @date 2016年3月25日下午5:24:19
 */
public class Factory {
	/**
	 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
	 * 
	 * @param type
	 * @return
	 */
	public FactoryInterface produce(String type) {

		if ("mail".equals(type)) {
			return new FactoryMail();
		} else if ("sms".equals(type)) {
			return new FactorySms();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}

	}

	/**
	 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法
	 * ，分别创建对象。
	 * 
	 * @return
	 */
	public FactoryInterface produceMail() {
		return new FactoryMail();

	}

	public FactoryInterface produceSms() {
		return new FactorySms();

	}

	/**
	 * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
	 * 
	 * @return
	 */
	public static FactoryInterface produceMailStatic() {
		return new FactoryMail();

	}

	public static FactoryInterface produceSmsStatic() {
		return new FactorySms();

	}
	/**
	 * 抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。具体实现看测试类
	 */
}
