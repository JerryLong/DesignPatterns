package com.dralong.design.test;

import com.dralong.design.facade.FacadeComputer;

public class FacadeTest {
	public static void main(String[] args) {
		FacadeComputer computer = new FacadeComputer();
		computer.startup();
		computer.shutdown();
	}
}
