package com.dralong.design.test;

import com.dralong.design.proxy.Proxy;
import com.dralong.design.proxy.Sourceable;
/**
 * <p>Title:ProxyTest<p>
 * <p>Description:<p> 
 * @author Jerry
 * @date 2016年3月25日下午1:55:28
 */
public class ProxyTest {

	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}

}
