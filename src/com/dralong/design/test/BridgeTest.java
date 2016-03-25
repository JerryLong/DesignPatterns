package com.dralong.design.test;

import com.dralong.design.bridge.Bridge;
import com.dralong.design.bridge.MyBridge;
import com.dralong.design.bridge.SourceSub1;
import com.dralong.design.bridge.SourceSub2;
import com.dralong.design.bridge.Sourceable;

public class BridgeTest {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();

		// 调用第一个对象
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();

		// 调用第二个对象
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}
}
