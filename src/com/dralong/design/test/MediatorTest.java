package com.dralong.design.test;

import com.dralong.design.mediator.Mediator;
import com.dralong.design.mediator.MyMediator;

public class MediatorTest {

	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
