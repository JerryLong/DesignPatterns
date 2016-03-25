package com.dralong.design.state;

/**
 * 
 * Title:Context
 *
 * Description: 状态模式切换类
 * 
 * @author Jerry
 * @date 2016年3月25日下午4:55:22
 */
public class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void method() {
		if (state.getValue().equals("state1")) {
			state.method1();
		} else if (state.getValue().equals("state2")) {
			state.method2();
		}
	}
}
