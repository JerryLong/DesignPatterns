package com.dralong.design.adapter;

/**
 * 
 * Title:Adapter
 *
 * Description:
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。主要分为三类：类的适配器模式、对象的适配器模式、
 * 接口的适配器模式。
 * 
 * @author Jerry
 * @date 2016年3月25日下午5:20:11
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method2!");
	}

}
