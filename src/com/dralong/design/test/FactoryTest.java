package com.dralong.design.test;

import com.dralong.design.factory.Factory;
import com.dralong.design.factory.impl.FactoryMainImpl;
import com.dralong.design.factory.interfaces.FactoryInterface;
import com.dralong.design.factory.interfaces.Provider;

public class FactoryTest {
	public static void main(String[] args) {
		factoryAbstract();
	}

	private static void factory() {
		Factory factory = new Factory();
		FactoryInterface fi = factory.produce("sms");
		fi.send();
	}

	private static void factoryMore() {

		Factory factory = new Factory();
		FactoryInterface fi = factory.produceMail();
		fi.send();
	}

	private static void factoryStatic() {
		FactoryInterface fi = Factory.produceMailStatic();
		fi.send();
	}

	private static void factoryAbstract() {
		Provider provider = new FactoryMainImpl();
		FactoryInterface fi = provider.produce();
		fi.send();
	}

}
