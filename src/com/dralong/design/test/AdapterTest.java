package com.dralong.design.test;

import com.dralong.design.adapter.Adapter;
import com.dralong.design.adapter.Targetable;

public class AdapterTest {

	public static void main(String[] args) {

		Targetable target = new Adapter();
		target.method1();
		target.method2();

	}

}
