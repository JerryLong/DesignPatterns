package com.dralong.design.bridge;

public class MyBridge extends Bridge {
	public void method() {
		getSource().method();
	}
}
