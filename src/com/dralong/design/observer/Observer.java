package com.dralong.design.observer;

/**
 * 
 * Title:Observer
 *
 * Description: ：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
 * 
 * @author Jerry
 * @date 2016年3月25日下午4:11:44
 */
public interface Observer {
	public void update();
}
