package com.dralong.design.factory.impl;

import com.dralong.design.factory.interfaces.FactoryInterface;

/**
 * 普通工厂模式实现类
 * 
 * @author Jerry
 *
 */
public class FactorySms implements FactoryInterface {

	@Override
	public void send() {
		System.out.println("this is FactorySms!");

	}

}
