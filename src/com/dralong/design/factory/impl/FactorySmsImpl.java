package com.dralong.design.factory.impl;

import com.dralong.design.factory.interfaces.FactoryInterface;
import com.dralong.design.factory.interfaces.Provider;

/**
 * 抽象工厂模式实现类
 * 
 * @author Jerry
 *
 */
public class FactorySmsImpl implements Provider {

	@Override
	public FactoryInterface produce() {
		return new FactorySms();
	}

}
